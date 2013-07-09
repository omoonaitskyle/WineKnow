package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class VarietalClicked extends Activity implements OnClickListener {
	
	private TextView textview;
	private String varietal = new String();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_varietal_clicked);
		

		//Set Listeners to All Buttons
        textview = (TextView) findViewById(R.id.cabernetSauvignon);
        textview.setOnClickListener(this);

        textview = (TextView) findViewById(R.id.chardonnay);
        textview.setOnClickListener(this);

        textview = (TextView) findViewById(R.id.merlot);
        textview.setOnClickListener(this);

        textview = (TextView) findViewById(R.id.pinotNoir);
        textview.setOnClickListener(this);

        textview = (TextView) findViewById(R.id.riesling);
        textview.setOnClickListener(this);

        textview = (TextView) findViewById(R.id.shiraz);
        textview.setOnClickListener(this);

        //textview = (TextView) findViewById(R.id.shiraz);
        //textview.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.varietal_clicked, menu);
		return true;
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
	    
	    /*
	    public void cabernetClicked(View view) {
	       	Intent intent = new Intent(this, CabernetClicked.class);
	    	//EditText editText = (EditText) findViewById(R.id.edit_message);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
    	finish();
	    }
	    
	    public void shirazClicked(View view) {
	       	Intent intent = new Intent(this, ShirazClicked.class);
	    	//EditText editText = (EditText) findViewById(R.id.edit_message);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
    	finish();
	    }
	    
	    public void chardonnayClicked(View view) {
	       	Intent intent = new Intent(this, ChardonnayClicked.class);
	    	//EditText editText = (EditText) findViewById(R.id.edit_message);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
    	finish();
	    }
	    
	    public void pinotClicked(View view) {
	       	Intent intent = new Intent(this, PinotNoirClicked.class);
	    	//EditText editText = (EditText) findViewById(R.id.edit_message);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
    	finish();
	    }
	    
	    public void rieslingClicked(View view) {
	       	Intent intent = new Intent(this, RieslingClicked.class);
	    	//EditText editText = (EditText) findViewById(R.id.edit_message);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
    	finish();
	    }
	    
	    public void merlotClicked(View view) {
	       	Intent intent = new Intent(this, MerlotClicked.class);
	    	//EditText editText = (EditText) findViewById(R.id.edit_message);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
    	finish();
	    }
	    */
	    

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch( v.getId() ) {

				default:
				case R.id.cabernetSauvignon: varietal = "Cabernet Sauvignon";
					break;
			
				case R.id.chardonnay: varietal = "Chardonnay";
					break;
			
				case R.id.merlot: varietal = "Merlot";
					break;
			
				case R.id.pinotNoir: varietal = "Pinot Noir";
					break;
			
				case R.id.riesling: varietal = "Riesling";
					break;
			
				case R.id.shiraz: varietal = "Syrah/Shiraz";
					break;
			}
			
			varietalSelected();
		}
		
	    public void varietalSelected() {
	       	Intent intent = new Intent(this, VarietalSelected.class);
	       	intent.putExtra("varietal", varietal);
	    	//EditText editText = (EditText) findViewById(R.id.edit_message);
	    	//String message = editText.getText().toString();
	    	//intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
	       	finish();
	    }
}