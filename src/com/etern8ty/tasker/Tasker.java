package com.etern8ty.tasker;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Tasker extends Activity {

	EditText inputBox;
	Button submit;
	ListView itemList;
	
	ArrayList<String> ToDoList;
	ArrayAdapter<String> holder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasker);
        inputBox = (EditText) findViewById(R.id.inputBox);
        submit = (Button) findViewById(R.id.submit);
        itemList = (ListView) findViewById(R.id.itemList);
        
        ToDoList = new ArrayList<String>();
        holder = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ToDoList);
        itemList.setAdapter(holder);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_tasker, menu);
        return true;
    }
    
    public void submitTask(View viewer){
    	
    	ToDoList.add(inputBox.getText().toString());
    	holder.notifyDataSetChanged();
    	inputBox.setText("");
    }
    
}
