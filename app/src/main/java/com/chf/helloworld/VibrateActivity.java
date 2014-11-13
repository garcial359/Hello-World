package com.chf.helloworld;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class VibrateActivity extends ActionBarActivity implements View.OnClickListener {

    private Button vibrateButton, rhythemButton, stopVibrationButton;
    private Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vibrate);

        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        vibrateButton = (Button) findViewById(R.id.vibrate);
        rhythemButton = (Button) findViewById(R.id.rhythem);
        stopVibrationButton = (Button) findViewById(R.id.stop_vibration);

        vibrateButton.setOnClickListener(this);
        rhythemButton.setOnClickListener(this);
        stopVibrationButton.setOnClickListener(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        vibrator.cancel();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.vibrate:
                vibrator.vibrate(1000);
                break;
            case R.id.rhythem:
                long[] pattern = {250, 500};
                vibrator.vibrate(pattern, 0);
                break;
            case R.id.stop_vibration:
                vibrator.cancel();
                break;
        }
    }
}
