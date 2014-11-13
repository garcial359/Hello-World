package com.chf.helloworld;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


public class ToDoActivity extends ListActivity implements View.OnClickListener {

    Button addToListButton;
    EditText newListItem;
    ListView toDoListView;

    ArrayList<String> toDoList;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.to_do);

        newListItem = (EditText) findViewById(R.id.user_input);
        addToListButton = (Button) findViewById(R.id.add_item_button);
        toDoListView = (ListView) findViewById(android.R.id.list);

        toDoList = new ArrayList<String>();
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, toDoList);
        toDoListView.setAdapter(aa);

        addToListButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (newListItem.length() > 0) {
            this.toDoList.add(newListItem.getText().toString());
            this.aa.notifyDataSetChanged();
            this.newListItem.setText("");
        }
    }

}


    /*


        public class ListAdapter extends BaseAdapter {

            public ListAdapter(){
                super();
            }

            @Override
            public int getCount() {
                return ListItem.listItem.length;
            }

            @Override
            public String getItem(int position) {
                return ListItem.listItem[position];
            }

            @Override
            public long getItemId(int position) {
                return ListItem.listItem[position].hashCode();
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                if (convertView == null) {
                    convertView = getLayoutInflater().inflate(R.layout.todo_list_items, parent, false);
                }
                ((TextView) convertView.findViewById(R.id.task)).setText(getItem(position));
                return convertView;
            }

        }

 /*   static class Holder {
        public TextView task;
        public CheckBox checkbox;

        public Holder(TextView task, CheckBox checkbox) {
            this.task = task;
            this.checkbox = checkbox;
        }
    }
*/