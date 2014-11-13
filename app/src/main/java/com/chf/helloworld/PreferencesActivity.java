package com.chf.helloworld;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class PreferencesActivity extends ActionBarActivity {

    private TextView welcomeMessage;
    private EditText userName;
    private Button saveUser;
//    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences);

        welcomeMessage = (TextView) findViewById(R.id.welcome_string);
        userName = (EditText) findViewById(R.id.user_name);
        saveUser = (Button) findViewById(R.id.save_button);

        final SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String userNameString = preferences.getString(getString(R.string.pref_user_name), getString(R.string.guest));
        String welcomeMessageString = getString(R.string.message_welcome, userNameString);
        welcomeMessage.setText(welcomeMessageString);
        saveUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userNameFromUser = userName.getText().toString();

                Editor editor = preferences.edit();
                editor.putString(getString(R.string.pref_user_name), userNameFromUser);
                editor.commit();

                Toast toast = Toast.makeText(PreferencesActivity.this, getString(R.string.user_name_saved, userNameFromUser), Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_preferences, menu);
        return true;
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
