package com.chf.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class PhoneCallActivity extends ActionBarActivity implements View.OnClickListener {

    private Button makeTheCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone_call);

        makeTheCall = (Button) findViewById(R.id.make_the_call);
        makeTheCall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+1 262 363 3345"));
        startActivity(callIntent);
    }
}
