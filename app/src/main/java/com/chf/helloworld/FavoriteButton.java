package com.chf.helloworld;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;

public class FavoriteButton extends Activity implements View.OnClickListener {

    private ImageButton favoriteButton;
    private CheckBox favoriteCheckbox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite_button);

        favoriteButton = (ImageButton) findViewById(R.id.favorite_button);
        favoriteButton.setEnabled(false);

        favoriteCheckbox = (CheckBox) findViewById(R.id.favorite_checkbox);
        Drawable newBitmap = getResources().getDrawable(R.drawable.pressed);
        int widthOfBitmap = newBitmap.getIntrinsicWidth();
        favoriteCheckbox.setWidth(widthOfBitmap);

        favoriteCheckbox.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (favoriteCheckbox.isChecked()) {
            favoriteButton.setEnabled(true);
        }
        if (!favoriteCheckbox.isChecked()) {
            favoriteButton.setEnabled(false);
        }
    }
}