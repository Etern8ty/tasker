package com.etern8ty.tasker;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Tasker extends Activity {

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
}
