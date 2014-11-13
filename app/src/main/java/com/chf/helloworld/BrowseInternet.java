package com.chf.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class BrowseInternet extends ActionBarActivity implements View.OnClickListener {

    private Button browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browse_internet);

        browser = (Button) findViewById(R.id.browser);
        browser.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW);
        browserIntent.setData(Uri.parse(getString(R.string.website_google)));
        startActivity(browserIntent);
    }
}
