package com.example.remotectrl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /** Called when the user clicks the CONNECT button */
    public void connectify(View view) {
        // Do something in response to button
    	Intent intent = new Intent(this, ConnectActivity.class);
    	startActivity(intent);
    }
    /** Called when the user clicks the LEARN button */
    public void learnify(View view) {
        // Do something in response to button
    	Intent intent = new Intent(this, LearnActivity.class);
    	startActivity(intent);
    }
    /** Called when the user clicks the PLAY button */
    public void playify(View view) {
        // Do something in response to button
    	Intent intent = new Intent(this, PlayActivity.class);
    	startActivity(intent);
    }
    /** Called when the user clicks the ADVANCED button */
    public void advanced(View view) {
        // Do something in response to button
//    	Intent intent = new Intent(this, AdvancedActivity.class);
//    	startActivity(intent);
    	Log.w("Remote CTRL", "advanced mode");
    }
}
