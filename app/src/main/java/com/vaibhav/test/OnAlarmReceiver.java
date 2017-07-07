package com.vaibhav.test;

/**
 * Created by Vaibhav Barad on 7/7/17.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class OnAlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        context.startService( new Intent(context, LocationWriteService.class));
    }
}