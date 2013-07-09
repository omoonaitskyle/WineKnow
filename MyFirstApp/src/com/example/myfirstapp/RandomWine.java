package com.example.myfirstapp;

import java.io.IOException;
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

public class RandomWine extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Hide status bar
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_random_wine);
		
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
		
		Cursor c = MainActivity.wineDB.getRandomWine();
		int size = c.getCount();
		Random r = new Random();
		int id = r.nextInt(size);
		c.moveToPosition(id);
		
		int nameLength = c.getString(0).length();
		String name = "Name: " + c.getString(0).substring(0, nameLength - 5);
		String varietal = "Varietal: " + c.getString(5);
		String color = "Color: "+c.getString(2);
		String date = "Date: " + (c.getString(0).substring(nameLength - 5));
		
		
		//String s = new String();
    	//for(int i = 0; i < c.getColumnCount(); i++)
    //	{
    //		s += c.getString(0) + " ";
    //	}
    	
		////System.out.println(s);
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
		int size = c.getCount();
		Random r = new Random();
		int id = r.nextInt(size);
		c.moveToPosition(id);
		
		int nameLength = c.getString(0).length();
		String name = "Name: " + c.getString(0).substring(0, nameLength - 5);
		String varietal = "Varietal: " + c.getString(5);
		String color = "Color: "+c.getString(2);
		String date = "Date: " + (c.getString(0).substring(nameLength - 5));
		
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

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.random_wine, menu);
		
		return true;
	}

}
