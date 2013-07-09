package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewRatingClicked extends Activity {

	private ImageView cork1;
	private ImageView cork2;
	private ImageView cork3;
	private ImageView cork4;
	private ImageView cork5;
	
	private TextView text1;
	private TextView text2;
	private TextView text3;
	private TextView text4;
	private TextView text5;
	
	private TextView noName;
	private Button giveRating;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_rating_clicked);

		cork1 = (ImageView)findViewById(R.id.cork1);
		cork2 = (ImageView)findViewById(R.id.cork2);
		cork3 = (ImageView)findViewById(R.id.cork3);
		cork4 = (ImageView)findViewById(R.id.cork4);
		cork5 = (ImageView)findViewById(R.id.cork5);

		text1 = (TextView) findViewById(R.id.text1);
		text2 = (TextView) findViewById(R.id.text2);
		text3 = (TextView) findViewById(R.id.text3);
		text4 = (TextView) findViewById(R.id.text4);
		text5 = (TextView) findViewById(R.id.text5);
		
		noName = (TextView) findViewById(R.id.noName);
		
		giveRating = (Button) findViewById(R.id.giveRating);
		
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
        
		Cursor c = MainActivity.wineDB.getRatedWines();
		int size = c.getCount();
		
		//System.out.println("count is " + size);
		
		c.moveToFirst();
		
		if (size == 0)
		{
			//Show there are no wines
			//System.out.println("NO WINES RATED");
			cork1.setVisibility(View.GONE);
			cork2.setVisibility(View.GONE);
			cork3.setVisibility(View.GONE);
			cork4.setVisibility(View.GONE);
			cork5.setVisibility(View.GONE);
			noName.setVisibility(View.VISIBLE);
			giveRating.setVisibility(View.VISIBLE);

		}
		if (size == 1)
		{
			cork1.setVisibility(View.VISIBLE);
			text1.setVisibility(View.VISIBLE);
			text1.setText("Name: " + c.getString(1) + "\t" + "Rating: " + c.getInt(5)); 
			cork2.setVisibility(View.GONE);
			cork3.setVisibility(View.GONE);
			cork4.setVisibility(View.GONE);
			cork5.setVisibility(View.GONE);
		}
		
		if (size == 2)
		{
			cork1.setVisibility(View.VISIBLE);
			text1.setVisibility(View.VISIBLE);
			text1.setText("Name: " + c.getString(1) + "\t" + "Rating: " + c.getInt(5)); 
			cork2.setVisibility(View.VISIBLE);
			text2.setVisibility(View.VISIBLE);
			c.moveToNext();
			text2.setText("Name: " + c.getString(1) + "\t" + "Rating: " + c.getInt(5)); 
			cork3.setVisibility(View.GONE);
			cork4.setVisibility(View.GONE);
			cork5.setVisibility(View.GONE);
		}
		
		if (size == 3)
		{
			cork1.setVisibility(View.VISIBLE);
			text1.setVisibility(View.VISIBLE);
			text1.setText("Name: " + c.getString(1) + "\t" + "Rating: " + c.getInt(5)); 
			cork2.setVisibility(View.VISIBLE);
			text2.setVisibility(View.VISIBLE);
			c.moveToNext();
			text2.setText("Name: " + c.getString(1) + "\t" + "Rating: " + c.getInt(5));
			cork3.setVisibility(View.VISIBLE);
			text3.setVisibility(View.VISIBLE);
			c.moveToNext();
			text3.setText("Name: " + c.getString(1) + "\t" + "Rating: " + c.getInt(5));
			cork4.setVisibility(View.GONE);
			cork5.setVisibility(View.GONE);
		}
		if (size == 4)
		{
			cork1.setVisibility(View.VISIBLE);
			text1.setVisibility(View.VISIBLE);
			text1.setText("Name: " + c.getString(1) + "\t" + "Rating: " + c.getInt(5)); 
			cork2.setVisibility(View.VISIBLE);
			text2.setVisibility(View.VISIBLE);
			c.moveToNext();
			text2.setText("Name: " + c.getString(1) + "\t" + "Rating: " + c.getInt(5));
			cork3.setVisibility(View.VISIBLE);
			text3.setVisibility(View.VISIBLE);
			c.moveToNext();
			text3.setText("Name: " + c.getString(1) + "\t" + "Rating: " + c.getInt(5));
			cork4.setVisibility(View.VISIBLE);
			text4.setVisibility(View.VISIBLE);
			c.moveToNext();
			text4.setText("Name: " + c.getString(1) + "\t" + "Rating: " + c.getInt(5));
			cork5.setVisibility(View.GONE);
		}
		
		if (size >= 5)
		{
			cork1.setVisibility(View.VISIBLE);
			text1.setVisibility(View.VISIBLE);
			text1.setText("Name: " + c.getString(1) + "\t" + "Rating: " + c.getInt(5)); 
			cork2.setVisibility(View.VISIBLE);
			text2.setVisibility(View.VISIBLE);
			c.moveToNext();
			text2.setText("Name: " + c.getString(1) + "\t" + "Rating: " + c.getInt(5));
			cork3.setVisibility(View.VISIBLE);
			text3.setVisibility(View.VISIBLE);
			c.moveToNext();
			text3.setText("Name: " + c.getString(1) + "\t" + "Rating: " + c.getInt(5));
			cork4.setVisibility(View.VISIBLE);
			text4.setVisibility(View.VISIBLE);
			c.moveToNext();
			text4.setText("Name: " + c.getString(1) + "\t" + "Rating: " + c.getInt(5));
			cork5.setVisibility(View.VISIBLE);
			text5.setVisibility(View.VISIBLE);
			c.moveToNext();
			text5.setText("Name: " + c.getString(1) + "\t" + "Rating: " + c.getInt(5));
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.view_rating_clicked, menu);
		return true;
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
    
    public void giveRating(View view) {
       	Intent intent = new Intent(this, GiveRatingClicked.class);
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
    
}
