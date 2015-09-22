package com.appenginecomparison;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAttribute;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAutoGeneratedKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBIndexRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBTable;

@DynamoDBTable(tableName = "Amazon_AEC")
public class SendData {
	
		private String sendDataID;
		
		private String text;

		@DynamoDBIndexRangeKey(attributeName = "data")
		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
		
		public void setSendDataID(String setSendDataID) {
			this.sendDataID = setSendDataID;
		}
		
		@DynamoDBHashKey(attributeName = "Id")
		@DynamoDBAutoGeneratedKey()
		public String getSendDataID()
		{
			return sendDataID;
		}
/*		
		@DynamoDBAttribute(attributeName = "SendDataID")
		public String getEndUserID() {
			return sendDataID;
		}*/
}