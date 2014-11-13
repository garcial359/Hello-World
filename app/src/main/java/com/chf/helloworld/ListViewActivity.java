package com.chf.helloworld;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Lucas on 11/6/2014.
 */
public class ListViewActivity extends ListActivity {

    private ListView fruitsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        String[] fruits = getResources().getStringArray(R.array.fruits);
        ArrayAdapter<String> fruitsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruits);
        setListAdapter(fruitsAdapter);
    }

}
