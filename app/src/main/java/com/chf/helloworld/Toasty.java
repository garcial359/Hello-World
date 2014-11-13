package com.chf.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Lucas on 11/6/2014.
 */
public class Toasty extends Activity {

    private TextView title2;
    private Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast);

        title2 = (EditText) findViewById(R.id.title2);
        done = (Button) findViewById(R.id.done);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameString = title2.getText().toString();
                if (nameString.length() == 0) {
                    Toast toast = Toast.makeText(v.getContext(), getString(R.string.message_empty_name), Toast.LENGTH_LONG);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(v.getContext(), getString(R.string.message_welcome, nameString), Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}
