package com.etern8ty.tasker;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Tasker extends Activity {

	private ArrayList<String> ToDoList;
	
	public Tasker(){
		super();
		ToDoList = new ArrayList<String>();
	}
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasker);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_tasker, menu);
        return true;
    }
    
    public void submitTask(View viewer){
    	addRow();
    	printList();
    }
    
    private void addRow(){
    	EditText inputBox = (EditText) findViewById(R.id.inputBox);
    	ToDoList.add(inputBox.getText().toString());
    	inputBox.clearComposingText();
    }
    
    private void printList(){
    	LinearLayout ToDoHolder = (LinearLayout) findViewById(R.id.holder);
    	for(int i=0; i<ToDoList.size(); i++){
    		TextView ToDoItem = new TextView(this);
    		ToDoItem.setId(i);
    		ToDoItem.setText(ToDoList.get(i));
    		ToDoHolder.addView(ToDoItem);
    	}
    }
    
}
