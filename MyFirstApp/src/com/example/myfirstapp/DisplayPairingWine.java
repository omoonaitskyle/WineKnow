package com.example.myfirstapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.example.myfirstapp.util.*;
import com.example.myfirstapp.util.DatabaseHelper.FOOD;

public class DisplayPairingWine extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//System.out.println("Inside DisplayPairingWine");
		
		super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Hide status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_display_pairing_wine);
		
		TextView nameTextView = (TextView) findViewById(R.id.nameText);
		TextView varietalTextView = (TextView) findViewById(R.id.varietalText);
		TextView colorTextView = (TextView) findViewById(R.id.colorText);
		TextView dateTextView = (TextView) findViewById(R.id.dateText);
		
		MainActivity.verifyOpen();
		
		/*
		wineDB = new DatabaseHelper(this);
        
        try {
        	wineDB.createDatabase();
        }
        catch (IOException e) {
        	//throw new Error("Unable to create database.");
        	//System.out.println("test");
        }
        
        try {
        	wineDB.openDatabase();
        }
        catch (SQLException e) {
        	//throw e;
        	//System.out.println("Couldn't open database.");
        }
        
        */
		
		
		Intent intent =  getIntent();
		int num = intent.getIntExtra("num", -1);
		
		////System.out.println(num);
				
		FOOD food;
		
		switch(num)
		{
		case 0:
			food = FOOD.SWEETS;
			break;
			
		case 1:
			food = FOOD.CURED_MEAT;
			break;
			
		case 2:
			food = FOOD.RED_MEAT;
			break;
			
		case 3:
			food = FOOD.WHITE_MEAT;
			break;
			
		case 4:
			food = FOOD.RICH_FISH;
			break;
			
		case 5:
			food = FOOD.FISH;
			break;
			
		case 6:
			food = FOOD.STARCHES;
			break;
			
		case 7:
			food = FOOD.CHEESE;
			break;
			
		case 8:
			food = FOOD.ROASTED_VEGETABLES;
			break;
			
		case 9:
			food = FOOD.VEGETABLES;
			break;
			
		default:
			food = FOOD.RED_MEAT;
			break;
		}
		
		//System.out.println( food );
		
		ArrayList<String> alist = MainActivity.wineDB.getWines(food);
		Cursor c;
		Random r = new Random();
		
		// Keep getting wines by varietal until a varietal with >0 wines is found
		do {
			////System.out.println("Inside loop");
			int index = r.nextInt(alist.size());
			String var = alist.get(index);
			//System.out.println(var);
			c = MainActivity.wineDB.getWinesByVarietal(var);
		} while( c.getCount() == 0 );
		
		c.moveToFirst();
		
		
		//System.out.println( c.getCount() );
		
		int index = r.nextInt( c.getCount() );
		//System.out.println( index );
		
		for(int i = 0; i < index; i++) {
			c.moveToNext();
		}
		
		
		// Code to print out a wine entry's data, line-by-line
		String s = new String();
    	for(int i = 0; i < c.getColumnCount(); i++)
    	{
    		s += "" + i + ": " + c.getString(i) + "\n";
    	}
    	
		//System.out.println(s);

		
		int nameLength = c.getString(0).length();
		String name = "Name: " + c.getString(0).substring(0, nameLength - 5);
		String varietal = "Varietal: " + c.getString(5);
		String color = "Color: " + c.getString(2);
		String date = "Date: " + (c.getString(0).substring(nameLength - 5));
		
		nameTextView.setText( name );
		dateTextView.setText( date );
		varietalTextView.setText( varietal );
		colorTextView.setText(color);
		
	}
	
	public void newRandomClicked(View view){
		TextView nameTextView = (TextView) findViewById(R.id.nameText);
		TextView varietalTextView = (TextView) findViewById(R.id.varietalText);
		TextView colorTextView = (TextView) findViewById(R.id.colorText);
		TextView dateTextView = (TextView) findViewById(R.id.dateText);
		
		Cursor c = MainActivity.wineDB.getRandomWine();
		c.moveToFirst();
		
		int nameLength = c.getString(1).length();
		String name = "Name: " + c.getString(1).substring(0, nameLength - 5);
		String varietal = "Varietal: " + c.getString(3);
		String color = "Color: "+c.getString(4);
		String date = "Date: " + (c.getString(1).substring(nameLength - 5));
		
		nameTextView.setText( name );
		dateTextView.setText( date );
		varietalTextView.setText( varietal );
		colorTextView.setText(color);
		
	}
	
	public void home(View view) {
       	Intent intent = new Intent(this, MainActivity.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
       	finish();
    }
	
    public void sipClicked(View view) {
       	Intent intent = new Intent(this, SipClicked.class);
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
    
    public void termsClicked(View view) {
       	Intent intent = new Intent(this, TermsClicked.class);
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
    
    public void backToPairing(View view) {
       	Intent intent = new Intent(this, PairingClicked.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
       	finish();
    }

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.random_wine, menu);
		
		return true;
	}

}
