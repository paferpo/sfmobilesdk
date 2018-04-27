package com.sfdevtools.yeah2;

import android.app.Application;

import com.salesforce.androidsdk.analytics.security.Encryptor;
import com.salesforce.androidsdk.app.SalesforceSDKManager.KeyInterface;
import com.salesforce.androidsdk.smartsync.app.SmartSyncSDKManager;


/**
 * Application class for our application.
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SmartSyncSDKManager.initNative(getApplicationContext(), new NativeKeyImpl(), MainActivity.class);
    }
}

class NativeKeyImpl implements KeyInterface {

    @Override
    public String getKey(String name) {
        return Encryptor.hash(name + "12s9adpahk;n12-97sdainkasd=013", name + "14kl0dsakj4-cxh1qewkjasdol8");
    }
}