package com.chf.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class TrafficLights extends Activity implements OnClickListener {

    private ImageView redLight;
    private ImageView yellowLight;
    private ImageView greenLight;

    private Button redButton;
    private Button yellowButton;
    private Button greenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.traffic_lights);

        redLight = (ImageView) findViewById(R.id.red_light);
        yellowLight = (ImageView) findViewById(R.id.yellow_light);
        greenLight = (ImageView) findViewById(R.id.green_light);

        redButton = (Button) findViewById(R.id.red_button);
        yellowButton = (Button) findViewById(R.id.yellow_button);
        greenButton = (Button) findViewById(R.id.green_button);

        redButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);

        redLight.setOnClickListener(this);
        yellowLight.setOnClickListener(this);
        greenLight.setOnClickListener(this);

    }

    public void onClick(View v) {
        turnLightsOff();

        switch (v.getId()) {
            case R.id.red_button:
            case R.id.red_light:
                turnOnRedLight();
                break;
            case R.id.yellow_button:
            case R.id.yellow_light:
                turnOnYellowLight();
                break;
            case R.id.green_button:
            case R.id.green_light:
                turnOnGreenLight();
                break;
            default:
                break;
        }
    }

    private void turnLightsOff() {
        redLight.setImageResource(R.drawable.light_off);
        yellowLight.setImageResource(R.drawable.light_off);
        greenLight.setImageResource(R.drawable.light_off);
    }

    private void turnOnRedLight() {
        redLight.setImageResource(R.drawable.red_on);
    }

    private void turnOnYellowLight() {
        yellowLight.setImageResource(R.drawable.yellow_on);
    }

    private void turnOnGreenLight() {
        greenLight.setImageResource(R.drawable.green_on);
    }

}