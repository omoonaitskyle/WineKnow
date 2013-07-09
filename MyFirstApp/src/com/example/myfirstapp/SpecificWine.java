package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class SpecificWine extends Activity implements OnClickListener{

	
	Button color;
	Button varietal;
	Button descriptor;
	private ImageView red;
	private ImageView white;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Hide status bar
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_specific_wine);
		
		

		red = (ImageView)findViewById(R.id.redButton);
		red.setVisibility(View.INVISIBLE);
		
		white = (ImageView)findViewById(R.id.whiteButton);
		white.setVisibility(View.INVISIBLE);
		
		color = (Button)findViewById(R.id.colorButton);
		color.setOnClickListener(this);
		
		varietal = (Button)findViewById(R.id.varietalButton);
		
		descriptor = (Button)findViewById(R.id.descriptorButton);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.specific_wine, menu);
		
		return true;
	}
	
	public void onClick(View v) {
		red.setVisibility(View.VISIBLE);
		white.setVisibility(View.VISIBLE);
		color.setVisibility(View.INVISIBLE);
		varietal.setVisibility(View.INVISIBLE);
		descriptor.setVisibility(View.INVISIBLE);
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
	    
	    public void redWineClicked(View view) {
	       	Intent intent = new Intent(this, SpecificRedClicked.class);
	    	//EditText editText = (EditText) findViewById(R.id.edit_message);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
    	finish();
	    }
	    
	    public void whiteWineClicked(View view) {
	       	Intent intent = new Intent(this, SpecificWhiteClicked.class);
	    	//EditText editText = (EditText) findViewById(R.id.edit_message);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
    	finish();
	    }
	    
	    public void varietalClicked(View view) {
	       	Intent intent = new Intent(this, VarietalClicked.class);
	    	//EditText editText = (EditText) findViewById(R.id.edit_message);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
    	finish();
	    }
	    
	    public void descriptorClicked(View view) {
	       	Intent intent = new Intent(this, DescriptorClicked.class);
	    	//EditText editText = (EditText) findViewById(R.id.edit_message);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
    	finish();
	    }

}
