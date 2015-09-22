package com.appenginecomparison;

import android.util.Log;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;

public class DatabaseManager {

	private static final String TAG = "DatabaseManager";

	public static void insertData(String text) {

		AmazonDynamoDBClient ddb = MainActivity.clientManager.ddb();
		DynamoDBMapper mapper = new DynamoDBMapper(ddb);

		try {
			SendData data = new SendData();
			data.setText(text);
			Log.d(TAG, "Inserting users");
			mapper.save(data);
			Log.d(TAG, "Users inserted");
		} catch (AmazonServiceException ex) {
			Log.d(TAG, "" + ex.getErrorType());
			Log.d(TAG, "Error Code " + ex.getErrorCode());
			Log.d(TAG, "Status Code " + ex.getStatusCode());
			Log.e(TAG, "Error inserting users");
		}
	}
}
