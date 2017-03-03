package com.example.yashjindal.dday;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class SmsListener extends BroadcastReceiver {

    private SharedPreferences preferences;


        public void onReceive(Context context, Intent intent)
        {
            Bundle myBundle = intent.getExtras();
            SmsMessage [] messages = null;
            String strMessage = "";

            if (myBundle != null)
            {
                Object [] pdus = (Object[]) myBundle.get("pdus");
                messages = new SmsMessage[pdus.length];

                for (int i = 0; i < messages.length; i++)
                {
                    messages[i] = SmsMessage.createFromPdu((byte[]) pdus[i]);
                    strMessage += "SMS From: " + messages[i].getOriginatingAddress();
                    strMessage += " : ";
                    strMessage += messages[i].getMessageBody();
                    strMessage += "\n";
                }

                Toast.makeText(context, strMessage, Toast.LENGTH_SHORT).show();
            }
        }

    }
