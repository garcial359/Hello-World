package com.chf.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Lucas on 11/6/2014.
 */
public class RadioButtons extends Activity implements OnClickListener {
    private RadioGroup preparation;
    private RadioButton shaken, stirred;
    private ListView fruitsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_buttons);

        preparation = (RadioGroup) findViewById(R.id.preparation);
        shaken = (RadioButton) findViewById(R.id.shaken);
        stirred = (RadioButton) findViewById(R.id.stirred);

        int checkedRadioButtonId = preparation.getCheckedRadioButtonId();

        shaken.setOnClickListener(this);
        stirred.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String answer = new String();
        switch (preparation.getCheckedRadioButtonId()) {
            case R.id.shaken:
                answer = getString(R.string.shaken_option);
                break;
            case R.id.stirred:
                answer = getString(R.string.stirred_option);
                break;
            default:
                break;
        }

        Toast.makeText(this, getString(R.string.message_selection) + " " + answer.toString(), Toast.LENGTH_SHORT).show();

    }

}
