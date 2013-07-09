package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DescriptorClicked extends Activity implements OnClickListener {

	private Button button;
	String descriptor = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_descriptor_clicked);
		
		//Set Listeners to All Buttons
        button = (Button) findViewById(R.id.light);
        button.setOnClickListener(this);
		
        button = (Button) findViewById(R.id.fruity);
        button.setOnClickListener(this);
		
        button = (Button) findViewById(R.id.smooth);
        button.setOnClickListener(this);
		
        button = (Button) findViewById(R.id.supple);
        button.setOnClickListener(this);
		
        button = (Button) findViewById(R.id.earthy);
        button.setOnClickListener(this);
		
        button = (Button) findViewById(R.id.spicy);
        button.setOnClickListener(this);
		
        button = (Button) findViewById(R.id.big);
        button.setOnClickListener(this);
		
        button = (Button) findViewById(R.id.bold);
        button.setOnClickListener(this);
		
        button = (Button) findViewById(R.id.crisp);
        button.setOnClickListener(this);
		
        button = (Button) findViewById(R.id.rich);
        button.setOnClickListener(this);
		
        button = (Button) findViewById(R.id.creamy);
        button.setOnClickListener(this);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.descriptor_clicked, menu);
		return true;
	}
	
	
	public void onClick (View v) {
		
		switch (v.getId()) {
		
		case R.id.light: descriptor = "light";
						 break;
						 
		case R.id.fruity: descriptor = "fruity";
		 break;
		 
		case R.id.smooth: descriptor = "smooth";
		 break;
		 
		case R.id.supple: descriptor = "supple";
		 break;
		 
		 
		case R.id.earthy: descriptor = "earthy";
		 break;
		 
		case R.id.spicy: descriptor = "spicy";
		 break;
		 
		case R.id.big: descriptor = "big";
		 break;
		 
		case R.id.bold: descriptor = "bold";
		 break;
		 
		case R.id.crisp: descriptor = "crisp";
		 break;
		 
		case R.id.rich: descriptor = "rich";
		 break;
		 
		case R.id.creamy: descriptor = "creamy";
		 break;
		}
		
		descriptorSelected();
		
	}
	
    public void sipClicked(View view) {
       	Intent intent = new Intent(this, SipClicked.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    	finish();
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
	    
	    public void help(View view) {
	       	Intent intent = new Intent(this, Help.class);
	    	//EditText editText = (EditText) findViewById(R.id.edit_message);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
	       	finish();
	    }
	    
	    public void descriptorSelected() {
	       	Intent intent = new Intent(this, DescriptorSelected.class);
	       	intent.putExtra("descriptor", descriptor);
	    	//EditText editText = (EditText) findViewById(R.id.edit_message);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
	       	finish();
	    }

}
