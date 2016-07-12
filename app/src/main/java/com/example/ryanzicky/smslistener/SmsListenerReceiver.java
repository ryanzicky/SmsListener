package com.example.ryanzicky.smslistener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;

import java.util.Objects;

import static android.telephony.SmsMessage.*;

/**
 * Created by ryanzicky on 2016/7/12.
 */
public class SmsListenerReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Object[] objects = (Object[]) intent.getExtras().get("pud");

        for(Object pdu : objects){
            SmsMessage smsMessage = createFromPdu((byte[]) pdu, "");

            String body = smsMessage.getMessageBody();

            String address = smsMessage.getOriginatingAddress();
        }
    }
}
