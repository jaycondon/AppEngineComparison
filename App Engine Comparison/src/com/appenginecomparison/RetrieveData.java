package com.appenginecomparison;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.appenginecomparison.getdataendpoint.Getdataendpoint;
import com.appenginecomparison.getdataendpoint.model.CollectionResponseGetData;
import com.appenginecomparison.getdataendpoint.model.GetData;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.json.jackson2.JacksonFactory;

import android.app.Activity;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class RetrieveData extends ListActivity {

	private ListView dataList;
	// array of objects of type Recipe
	private List<GetData> getData = null;
	private SimpleAdapter adapter = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.get_data);

		dataList = (ListView) findViewById(R.id.DataStoreList);

		new ListOfDataAsyncRetriever(this).execute();
	}

	private class ListOfDataAsyncRetriever extends
			AsyncTask<Void, Void, CollectionResponseGetData> {
		Context context;
		private ProgressDialog pd;

		public ListOfDataAsyncRetriever(Context context) {
			this.context = context;
		}

		protected void onPreExecute() {
			super.onPreExecute();
			pd = new ProgressDialog(context);
			pd.setMessage("Loading Data");
			pd.show();

		}

		@Override
		protected CollectionResponseGetData doInBackground(Void... params) {

			Getdataendpoint.Builder endpointBuilder = new Getdataendpoint.Builder(
					AndroidHttp.newCompatibleTransport(), new JacksonFactory(),
					null);

			endpointBuilder = CloudEndpointUtils.updateBuilder(endpointBuilder);

			CollectionResponseGetData result;

			Getdataendpoint endpoint = endpointBuilder.build();

			try {
				result = endpoint.listgetData().execute();
			}

			catch (IOException e) {
				e.printStackTrace();
				result = null;
			}// end catch

			return result;
		}// end CollectionResponseData

		@Override
		protected void onPostExecute(CollectionResponseGetData result) {
			pd.dismiss();

			ArrayList<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

			getData = result.getItems();

			for (GetData gd : getData) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("textview_data", gd.getDatastoreText());
				data.add(map);
			}

			adapter = new SimpleAdapter(RetrieveData.this, data,
					R.layout.data_item, new String[] { "textview_data" },
					new int[] { R.id.textview_data });
			
			dataList.setAdapter(adapter);

		}
	}
}
