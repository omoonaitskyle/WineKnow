package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;

public class SipClicked extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_sip_clicked);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sip_clicked, menu);
		return true;
	}
    
    
    public void termsClicked(View view) {
       	Intent intent = new Intent(this, TermsClicked.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    	finish();
    }
    
    public void factsClicked(View view) {
       	Intent intent = new Intent(this, FactsClicked.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    	finish();
    }
    
    public void eatClicked(View view) {
       	Intent intent = new Intent(this, EatClicked.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    	finish();
    }
    
    public void reviewClicked(View view) {
       	Intent intent = new Intent(this, ReviewClicked.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    	finish();
    }
    
    
    public void home(View view) {
       	Intent intent = new Intent(this, MainActivity.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    	finish();
    }
    
    public void randomWineClicked(View view) {
       	Intent intent = new Intent(this, RandomWine.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    	finish();
    }
    
    public void specificWineClicked(View view) {
       	Intent intent = new Intent(this, SpecificWine.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    	finish();
    }
    
    public void blankMethod(View view) {
    	System.out.println("Hello");
    }

    
    public void help(View view) {
       	Intent intent = new Intent(this, Help.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    	finish();
    }
    
}
