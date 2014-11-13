package com.chf.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import IntentUtils.IntentUtils;


public class SendEmailActivity extends ActionBarActivity implements View.OnClickListener {

    private Button sendEmailActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_email);

        sendEmailActivity = (Button) findViewById(R.id.sendEmailActivity);
        sendEmailActivity.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"reva.entringer@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "I gonna go AppSh!t in this piece");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "hehe I am having a lot of fun doing this stuff.  I sorry I so nerdy withcys!!!");
        emailIntent.setType("message/rfc822");

        if (IntentUtils.isIntentSupported(SendEmailActivity.this, emailIntent)) {
            startActivity(emailIntent);
        } else {
            Toast toast = Toast.makeText(SendEmailActivity.this, "No Email Client Found", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
