package com.appenginecomparison;

import android.content.Context;
import android.util.Log;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;

public class ClientManager {

    private AmazonDynamoDBClient ddb = null;
    private Context context;
    
    public ClientManager(Context context) {
        this.context = context;
    }
    
    public AmazonDynamoDBClient ddb() {
    	initClients();
        return ddb;
    }

    private void initClients() {
        CognitoCachingCredentialsProvider credentials = new CognitoCachingCredentialsProvider(
                context,
                Constants.ACCOUNT_ID,
                Constants.IDENTITY_POOL_ID,
                Constants.UNAUTH_ROLE_ARN,
                null,
                Regions.EU_WEST_1);

        Log.d("LogTag", "my ID is " + credentials.getIdentityId());
        Log.d("LogTag", "my ID Credentials  " + credentials.getCredentials());
        Log.d("LogTag", "my identity provider " + credentials.getIdentityProvider());
        Log.d("LogTag", "my Identity pool is " + credentials.getIdentityPoolId());
        Log.d("LogTag", "my credential is " + credentials.toString());
        
        ddb = new AmazonDynamoDBClient(credentials);
        ddb.setRegion(Region.getRegion(Regions.EU_WEST_1));
    }
}
