package com.chf.helloworld;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class ListDialogActivity extends Activity {

    private static final int COLOUR_PICKER_DIALOG = 1;
    private Button pickColour;
    private String[] colours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_dialog);

        Resources resources = getResources();
        colours = resources.getStringArray(R.array.colours);

        pickColour = (Button) findViewById(R.id.pick_colour);
        pickColour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(COLOUR_PICKER_DIALOG);
            }
        });

    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case COLOUR_PICKER_DIALOG:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle(R.string.choose_color_title);
                builder.setItems(colours, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast toast = Toast.makeText(ListDialogActivity.this, colours[which], Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
                return builder.create();
        }
        return super.onCreateDialog(id);
    }

}