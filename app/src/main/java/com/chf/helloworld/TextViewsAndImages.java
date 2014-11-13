package com.chf.helloworld;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Lucas on 11/6/2014.
 */
public class TextViewsAndImages extends Activity {

    private TextView title;
    private TextView summery;
    private TextView website;
    private TextView compound;
    private EditText name;
    private Button done, placeOrder;
    private ImageButton favoriteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_views_and_images);

        title = (TextView) findViewById(R.id.title);
        summery = (TextView) findViewById(R.id.summery);
        website = (TextView) findViewById(R.id.website);
        compound = (TextView) findViewById(R.id.compound);

        title.setText(R.string.android);
        summery.setText(R.string.android_summery);

        Resources resources = getResources();
        String appleSummery = resources.getString(R.string.apples_summery, 5, 2.56);

        summery.setText(appleSummery);
        summery.setTextColor(resources.getColor(R.color.money_green));

        website.setAutoLinkMask(Linkify.WEB_URLS);
        website.setText(R.string.website);

        compound.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_launcher), null, null);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
