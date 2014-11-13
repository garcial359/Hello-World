package com.chf.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Created by Lucas on 11/6/2014.
 */
public class CheckBoxes extends Activity {

    private CheckBox extraCheese, frenchFries, favoriteCheckbox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_boxes);

        Button placeOrder = (Button) findViewById(R.id.place_order);
        final CheckBox extraCheese = (CheckBox) findViewById(R.id.extra_cheese);
        final CheckBox frenchFries = (CheckBox) findViewById(R.id.french_fries);

        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuffer buffer = new StringBuffer();
                String newline = System.getProperty("line.separator");
                buffer.append("Burger");
                if (extraCheese.isChecked()) {
                    buffer.append(newline);
                    buffer.append(extraCheese.getText().toString());
                }
                if (frenchFries.isChecked()) {
                    buffer.append(newline);
                    buffer.append(frenchFries.getText().toString());
                }

                Toast.makeText(v.getContext(), buffer.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }

}
