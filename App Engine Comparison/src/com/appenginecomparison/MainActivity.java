package com.appenginecomparison;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

/**
 * The Main Activity.
 * 
 * This activity starts up the RegisterActivity immediately, which communicates
 * with your App Engine backend using Cloud Endpoints. It also receives push
 * notifications from backend via Google Cloud Messaging (GCM).
 * 
 * Check out RegisterActivity.java for more details.
 */
public class MainActivity extends Activity {
	public static ClientManager clientManager = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		clientManager = new ClientManager(this);

	}

	/** Called when the user clicks the send data button */
	public void sendData(View v) {
		Intent i = new Intent(MainActivity.this, PostData.class);
		startActivity(i);
	}

	public void getData(View v) {
		Intent i = new Intent(MainActivity.this, RetrieveData.class);
		startActivity(i);
	}

}
