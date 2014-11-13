package com.chf.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HelloWorld extends Activity implements OnClickListener {

    private Button textViewsandImages, radioButtons, favoriteButton;
    private Button tiling, listViewActivity, checkBoxes;
    private Button toasty, imageViewActivity, bookActivity;
    private Button gridViewActivity, siCalculator, homeScreen;
    private Button listDialogActivity, dialogActivity, vibrateActivity;
    private Button trafficLights, browseInternet, phoneCallActivity;
    private Button sendSMSActivity, sendEmailActivity, preferencesActivity;
    private Button toDoListActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world);

        textViewsandImages = (Button) findViewById(R.id.textViewsAndImages);
        textViewsandImages.setOnClickListener(this);
        tiling = (Button) findViewById(R.id.tiling);
        tiling.setOnClickListener(this);
        toasty = (Button) findViewById(R.id.toasty);
        toasty.setOnClickListener(this);
        radioButtons = (Button) findViewById(R.id.radioButtons);
        radioButtons.setOnClickListener(this);
        listViewActivity = (Button) findViewById(R.id.listViewActivity);
        listViewActivity.setOnClickListener(this);
        imageViewActivity = (Button) findViewById(R.id.imageViewActivity);
        imageViewActivity.setOnClickListener(this);
        favoriteButton = (Button) findViewById(R.id.favoriteButton);
        favoriteButton.setOnClickListener(this);
        checkBoxes = (Button) findViewById(R.id.checkBoxes);
        checkBoxes.setOnClickListener(this);
        bookActivity = (Button) findViewById(R.id.bookActivity);
        bookActivity.setOnClickListener(this);
        gridViewActivity = (Button) findViewById(R.id.gridViewActivity);
        gridViewActivity.setOnClickListener(this);
        siCalculator = (Button) findViewById(R.id.siCalculator);
        siCalculator.setOnClickListener(this);
        homeScreen = (Button) findViewById(R.id.homeScreen);
        homeScreen.setOnClickListener(this);
        trafficLights = (Button) findViewById(R.id.trafficLights);
        trafficLights.setOnClickListener(this);
        dialogActivity = (Button) findViewById(R.id.dialogActivity);
        dialogActivity.setOnClickListener(this);
        listDialogActivity = (Button) findViewById(R.id.listDialogActivity);
        listDialogActivity.setOnClickListener(this);
        vibrateActivity = (Button) findViewById(R.id.vibrateActivity);
        vibrateActivity.setOnClickListener(this);
        vibrateActivity = (Button) findViewById(R.id.vibrateActivity);
        vibrateActivity.setOnClickListener(this);
        browseInternet = (Button) findViewById(R.id.browseInternetActivity);
        browseInternet.setOnClickListener(this);
        phoneCallActivity = (Button) findViewById(R.id.phoneCallActivity);
        phoneCallActivity.setOnClickListener(this);
        sendSMSActivity = (Button) findViewById(R.id.sendSMSActivity);
        sendSMSActivity.setOnClickListener(this);
        sendEmailActivity = (Button) findViewById(R.id.sendEmailActivity);
        sendEmailActivity.setOnClickListener(this);
        preferencesActivity = (Button) findViewById(R.id.preferencesActivity);
        preferencesActivity.setOnClickListener(this);
        toDoListActivity = (Button) findViewById(R.id.toDoActivity);
        toDoListActivity.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.textViewsAndImages):
                Intent startTextViewsAndImages = new Intent(this, TextViewsAndImages.class);
                startActivity(startTextViewsAndImages);
                return;
            case (R.id.tiling):
                Intent startTiling = new Intent(this, Tiling.class);
                startActivity(startTiling);
                return;
            case (R.id.toasty):
                Intent startToasty = new Intent(this, Toasty.class);
                startActivity(startToasty);
                return;
            case (R.id.radioButtons):
                Intent startRadioButtons = new Intent(this, RadioButtons.class);
                startActivity(startRadioButtons);
                return;
            case (R.id.listViewActivity):
                Intent startListViewActivity = new Intent(this, ListViewActivity.class);
                startActivity(startListViewActivity);
                return;
            case (R.id.imageViewActivity):
                Intent startImageViewActivity = new Intent(this, ImageViewActivity.class);
                startActivity(startImageViewActivity);
                return;
            case (R.id.favoriteButton):
                Intent startFavoriteButton = new Intent(this, FavoriteButton.class);
                startActivity(startFavoriteButton);
                return;
            case (R.id.checkBoxes):
                Intent startCheckBoxes = new Intent(this, CheckBoxes.class);
                startActivity(startCheckBoxes);
                return;
            case (R.id.bookActivity):
                Intent startBookActivity = new Intent(this, BookActivity.class);
                startActivity(startBookActivity);
                return;
            case (R.id.gridViewActivity):
                Intent startGridViewActivity = new Intent(this, GridViewActivity.class);
                startActivity(startGridViewActivity);
                return;
            case (R.id.siCalculator):
                Intent startSICalculatorActivity = new Intent(this, SICalculatorActivity.class);
                startActivity(startSICalculatorActivity);
                return;
            case (R.id.homeScreen):
                Intent startHomeScreen = new Intent(this, HomeScreen.class);
                startActivity(startHomeScreen);
                return;
            case (R.id.trafficLights):
                Intent startTrafficLights = new Intent(this, TrafficLights.class);
                startActivity(startTrafficLights);
                return;
            case (R.id.dialogActivity):
                Intent startDialogActivity = new Intent(this, DialogActivity.class);
                startActivity(startDialogActivity);
                return;
            case (R.id.listDialogActivity):
                Intent startListDialogActivity = new Intent(this, ListDialogActivity.class);
                startActivity(startListDialogActivity);
                return;
            case (R.id.vibrateActivity):
                Intent startVibrateActivity = new Intent(this, VibrateActivity.class);
                startActivity(startVibrateActivity);
                return;
            case (R.id.browseInternetActivity):
                Intent startBrowseInternet = new Intent(this, BrowseInternet.class);
                startActivity(startBrowseInternet);
                return;
            case (R.id.phoneCallActivity):
                Intent startPhoneCallActivity = new Intent(this, PhoneCallActivity.class);
                startActivity(startPhoneCallActivity);
                return;
            case (R.id.sendSMSActivity):
                Intent startSendSMSActivity = new Intent(this, SendSMSActivity.class);
                startActivity(startSendSMSActivity);
                return;
            case (R.id.sendEmailActivity):
                Intent startSendEmailActivity = new Intent(this, SendEmailActivity.class);
                startActivity(startSendEmailActivity);
                return;
            case (R.id.preferencesActivity):
                Intent startPreferencesActivity = new Intent(this, PreferencesActivity.class);
                startActivity(startPreferencesActivity);
                return;
            case (R.id.toDoActivity):
                Intent startToDoActivity = new Intent(this, ToDoActivity.class);
                startActivity(startToDoActivity);
                return;
            default:
                return;
        }
    }
}
