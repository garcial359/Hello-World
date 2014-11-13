package com.chf.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Lucas on 11/6/2014.
 */
public class ImageViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bitmap_drawables);

        ImageView iconImageView = (ImageView) findViewById(R.id.icon);
        iconImageView.setImageResource(R.drawable.ic_launcher);

    }
}
