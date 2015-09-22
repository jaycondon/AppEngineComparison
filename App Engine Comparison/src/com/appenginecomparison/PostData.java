package com.appenginecomparison;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.Executor;

import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.appenginecomparison.senddataendpoint.Senddataendpoint;
import com.appenginecomparison.senddataendpoint.model.SendData;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class PostData extends Activity {
	// Android Widget Reference
	EditText userDataEditText;

	String userData;

	ProgressBar gaeProgress, amazonProgress;
	EndpointsTask gaeAsync;
	DynamoDBManagerTask amazonAsync;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send_data);
		userDataEditText = (EditText) findViewById(R.id.userData);
	}// end on create

	// function when post button clicked
	public void post(View v) throws IOException {
		// to check if fields are valid
		if (!isDataValid()) {
			Toast.makeText(getBaseContext(), "Please enter data ",
					Toast.LENGTH_LONG).show();
		}// end if
		else {

			gaeAsync = new EndpointsTask(getApplicationContext());
			StartAsyncTaskInParallel(gaeAsync);
			amazonTask = new DynamoDBManagerTask(amazonProgress);
			StartAsyncTaskInParallel(amazonAsync);

			// invoke GAE async
			// new EndpointsTask(this).execute(getApplicationContext());
			// amazon async
			// new DynamoDBManagerTask().execute();

		}
	}

	@SuppressLint("NewApi")
	public boolean isDataValid() {

		// check if empty
		boolean userData = !getUserData().isEmpty();
		return userData;
	}

	public String getUserData() {
		return userDataEditText.getText().toString().trim();
	}

	// GAE AsyncTask
	public class EndpointsTask extends AsyncTask<Context, Integer, Long> {
		Context context;
		private ProgressDialog p;

		public EndpointsTask(Context context) {
			this.context = context;
		}

		// display progress bar
		protected void onPreExecute() {
			super.onPreExecute();
			p = new ProgressDialog(context);
			p.setMessage("Posting Data To App Engines");
			p.show();

		}

		@Override
		protected Long doInBackground(Context... params) {

			// calls the back end API classes
			Senddataendpoint.Builder builder = new Senddataendpoint.Builder(
					AndroidHttp.newCompatibleTransport(), new JacksonFactory(),
					new HttpRequestInitializer() {
						public void initialize(HttpRequest httpRequest) {

						}
					});

			Senddataendpoint endpoint = CloudEndpointUtils.updateBuilder(
					builder).build();

			try {

				userData = userDataEditText.getText().toString();
				SendData sd = new SendData();
				String sendDataID = new Date().toString();

				sd.setSendDataID(sendDataID);
				sd.setText(userData);

				// object post information to GAE
				endpoint.insertSendData(sd).execute();

				// AMAZON
				// DatabaseManager.insertData(userData);

			} catch (IOException e) {
				e.printStackTrace();
			}

			// TODO Auto-generated method stub
			return (long) 0;

		}

		// On Completion of upload to GAE
		protected void onPostExecute(Long l) {
			p.dismiss();
			return;
		}// end postExecute

	}

	// AMAZON AsyncTask
	private class DynamoDBManagerTask extends AsyncTask<Context, Integer, Long> {
		Context context;
		private ProgressDialog pAmazon;

		// display progress bar
		protected void onPreExecute() {
			super.onPreExecute();
			pAmazon = new ProgressDialog(context);
			pAmazon.setMessage("Posting To Amazon");
			pAmazon.show();

		}

		@Override
		protected Long doInBackground(Context... params) {

			userData = userDataEditText.getText().toString();

			DatabaseManager.insertData(userData);

			// TODO Auto-generated method stub
			return (long) 0;
		}

		protected void onPostExecute(Long l) {
			pAmazon.dismiss();
			return;
		}

	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void StartAsyncTaskInParallel(EndpointsTask task) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)
			task.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
		else
			task.execute();
	}

}
