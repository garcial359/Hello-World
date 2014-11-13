package com.chf.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class SendSMSActivity extends ActionBarActivity implements View.OnClickListener {

    private Button sendSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_sms);

        sendSMS = (Button) findViewById(R.id.send_sms);
        sendSMS.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:+1 414 322 7537"));
        smsIntent.putExtra("sms_body", "Revies!!! I sent this via an App I programmed!!! See you soon!");
        startActivity(smsIntent);
    }
}
