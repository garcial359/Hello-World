package com.chf.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class SICalculatorActivity extends Activity implements OnClickListener, OnSeekBarChangeListener {

    double principalAmount;
    double interestRate;
    int years;
    double total;
    private EditText principal;
    private EditText interest;
    private Button calculateButton;
    private TextView output;
    private SeekBar time;
    private TextView timeDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sicalculator);

        principal = (EditText) findViewById(R.id.principal_input);
        interest = (EditText) findViewById(R.id.interest_input);
        calculateButton = (Button) findViewById(R.id.calculate_button);
        output = (TextView) findViewById(R.id.output_text);
        time = (SeekBar) findViewById(R.id.time_input);
        time.setMax(30);
        timeDisplay = (TextView) findViewById(R.id.time_display);

        calculateButton.setOnClickListener(this);
        time.setOnSeekBarChangeListener(this);

    }

    private void updateUI() {
        String textOutput = String.format("The interest rate for $%.0f at a rate of %.2f%% for %d year(s) is $%.2f",
                principalAmount, interestRate, years, total);
        output.setText(textOutput);
    }

    private void calcualateInterest() {
        total = principalAmount * (interestRate / 100) * years;
    }

    private void updateValuesFromFields() {
        if ((principal.getText().toString().equals("")) || (interest.getText().toString().equals(""))) {
            principalAmount = 0;
            interestRate = 0;
        } else {

            principalAmount = Double.parseDouble(principal.getText().toString());
            interestRate = Double.parseDouble(interest.getText().toString());
        }
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress,
                                  boolean fromUser) {
        timeDisplay.setText(progress + " year(s)");
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        years = seekBar.getProgress();
    }

    @Override
    public void onClick(View v) {
        if (v == calculateButton) {

            updateValuesFromFields();
            calcualateInterest();
            updateUI();

        }
    }
}
