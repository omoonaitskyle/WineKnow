package com.example.myfirstapp;

import java.io.IOException;
import java.util.Random;

import com.example.myfirstapp.util.DatabaseHelper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GiveRatingClicked extends Activity implements OnClickListener{
	
	//private Button firstButton;
	//private TextView changingTextView;
	private TextView name1TextView;
	private TextView name2TextView;
	private TextView name3TextView;
	private TextView name4TextView;
	private TextView name5TextView;
	private TextView name6TextView;
	private TextView name7TextView;
	private TextView name8TextView;
	private TextView name9TextView;
	private TextView name10TextView;
	
	private TextView text;
	
	
	private ImageView oneGlass;
	private ImageView twoGlass;
	private ImageView threeGlass;
	private ImageView fourGlass;
	private ImageView fiveGlass;
	private ImageView blanksquare;
	
	private Button rateAnother;
	private Button getRating;
	
	private CharSequence wineName;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
      //  requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Hide status bar
       // getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_give_rating_clicked);
		oneGlass = (ImageView)findViewById(R.id.one_glass);
		oneGlass.setOnClickListener(this);
		twoGlass = (ImageView)findViewById(R.id.two_glass);
		threeGlass = (ImageView)findViewById(R.id.three_glass);
		fourGlass = (ImageView)findViewById(R.id.four_glass);
		fiveGlass = (ImageView)findViewById(R.id.five_glass);
		blanksquare = (ImageView)findViewById(R.id.blanksquare);
		
		rateAnother = (Button)findViewById(R.id.rate_another_wine);
		getRating = (Button)findViewById(R.id.getRatings);


		twoGlass.setOnClickListener(this);
		threeGlass.setOnClickListener(this);
		fourGlass.setOnClickListener(this);
		fiveGlass.setOnClickListener(this);
		 
		text = (TextView) findViewById(R.id.rating_text);
		text.setVisibility(View.INVISIBLE);

		 name1TextView = (TextView) findViewById(R.id.name1Text);
		 name2TextView = (TextView) findViewById(R.id.name2Text);
		 name3TextView = (TextView) findViewById(R.id.name3Text);
		 name4TextView = (TextView) findViewById(R.id.name4Text);
		 name5TextView = (TextView) findViewById(R.id.name5Text);
		 name6TextView = (TextView) findViewById(R.id.name6Text);
		 name7TextView = (TextView) findViewById(R.id.name7Text);
		 name8TextView = (TextView) findViewById(R.id.name8Text);
		 name9TextView = (TextView) findViewById(R.id.name9Text);
		 name10TextView = (TextView) findViewById(R.id.name10Text);
		
		 text.setOnClickListener(this);
		 name1TextView.setOnClickListener(this);
		 name2TextView.setOnClickListener(this);
		 name3TextView.setOnClickListener(this);
		 name4TextView.setOnClickListener(this);
		 name5TextView.setOnClickListener(this);
		 name6TextView.setOnClickListener(this);
		 name7TextView.setOnClickListener(this);
		 name8TextView.setOnClickListener(this);
		 name9TextView.setOnClickListener(this);
		 name10TextView.setOnClickListener(this);

			MainActivity.verifyOpen();
		 
		 /*
		wineDB = new DatabaseHelper(this);
        
        try {
        	wineDB.createDatabase();
        }
        catch (IOException e) {
        	//throw new Error("Unable to create database.");
        	////System.outprintln("test");
        }
        
        try {
        	wineDB.openDatabase();
        }
        catch (SQLException e) {
        	//throw e;
        	////System.outprintln("Couldn't open database.");
        }
        */
		 
        //First Random Wine
		Cursor c = MainActivity.wineDB.getRandomWine();
		int size = c.getCount();
		Random r = new Random();
		int id = r.nextInt(size);
		c.moveToPosition(id);
		
		int nameLength = c.getString(0).length();
		String name = "" + c.getString(0).substring(0, nameLength - 5);
		
		name1TextView.setText( name );
	
	//Second Random Wine	
		id = r.nextInt(size);
		c.moveToNext();
		
		nameLength = c.getString(0).length();
		name = "" + c.getString(0).substring(0, nameLength - 5);
		
		name2TextView.setText( name );
		
		//Third Random Wine
		id = r.nextInt(size);
		c.moveToNext();
		
		nameLength = c.getString(0).length();
		name = "" + c.getString(0).substring(0, nameLength - 5);
		
		name3TextView.setText( name );
		
		//Fourth Random Wine
		id = r.nextInt(size);
		c.moveToNext();
		
		nameLength = c.getString(0).length();
		name = "" + c.getString(0).substring(0, nameLength - 5);
			
		name4TextView.setText( name );
		
		//Fifth Random Wine
		id = r.nextInt(size);
		c.moveToNext();
		
		nameLength = c.getString(0).length();
		name = "" + c.getString(0).substring(0, nameLength - 5);
		
		name5TextView.setText( name );
		
		//Sixth Random Wine
		id = r.nextInt(size);
		c.moveToNext();
		
		nameLength = c.getString(0).length();
		name = "" + c.getString(0).substring(0, nameLength - 5);
		
		name6TextView.setText( name );
		
		//Seventh Random Wine
		id = r.nextInt(size);
		c.moveToNext();
		
		nameLength = c.getString(0).length();
		name = "" + c.getString(0).substring(0, nameLength - 5);
		
		name7TextView.setText( name );
		
		//Eighth Random Wine
		id = r.nextInt(size);
		c.moveToNext();
		
		nameLength = c.getString(0).length();
		name = "" + c.getString(0).substring(0, nameLength - 5);
		
		name8TextView.setText( name );
		
		//Ninth Random Wine
		id = r.nextInt(size);
		c.moveToNext();
		
		nameLength = c.getString(0).length();
		name = "" + c.getString(0).substring(0, nameLength - 5);
		
		name9TextView.setText( name );
		
		
		//Tenth Random Wine
		id = r.nextInt(size);
		c.moveToNext();
		
		nameLength = c.getString(0).length();
		name = "" + c.getString(0).substring(0, nameLength - 5);
		
		name10TextView.setText( name );
		
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
    
    public void giveRating(View view) {
       	Intent intent = new Intent(this, GiveRatingClicked.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    	finish();
    }   
    
    public void getRating(View view) {
       	Intent intent = new Intent(this, ViewRatingClicked.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    	finish();
    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.give_rating_clicked, menu);
		return true;
	}
	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.name1Text)
		{
			text.setVisibility(View.VISIBLE);
			oneGlass.setVisibility(View.VISIBLE);
			oneGlass.setImageResource(R.drawable.one_glass);
			twoGlass.setVisibility(View.VISIBLE);
			twoGlass.setImageResource(R.drawable.two_glass);
			threeGlass.setVisibility(View.VISIBLE);
			threeGlass.setImageResource(R.drawable.three_glass);
			fourGlass.setVisibility(View.VISIBLE);
			fourGlass.setImageResource(R.drawable.four_glass);
			fiveGlass.setVisibility(View.VISIBLE);
			fiveGlass.setImageResource(R.drawable.five_glass);
			blanksquare.setVisibility(View.VISIBLE);
			blanksquare.setImageResource(R.drawable.blanksquare);
			name1TextView.setVisibility(View.GONE);
			name2TextView.setVisibility(View.GONE);
			name3TextView.setVisibility(View.GONE);
			name4TextView.setVisibility(View.GONE);
			name5TextView.setVisibility(View.GONE);
			name6TextView.setVisibility(View.GONE);
			name7TextView.setVisibility(View.GONE);
			name8TextView.setVisibility(View.GONE);
			name9TextView.setVisibility(View.GONE);
			name10TextView.setVisibility(View.GONE);
			
			rateAnother.setVisibility(View.INVISIBLE);
			getRating.setVisibility(View.INVISIBLE);			getRating.setVisibility(View.INVISIBLE);
	
			
			wineName = name1TextView.getText();
						
		}
		if (v.getId() == R.id.name2Text)
		{
			text.setVisibility(View.VISIBLE);
			oneGlass.setVisibility(View.VISIBLE);
			oneGlass.setImageResource(R.drawable.one_glass);
			twoGlass.setVisibility(View.VISIBLE);
			twoGlass.setImageResource(R.drawable.two_glass);
			threeGlass.setVisibility(View.VISIBLE);
			threeGlass.setImageResource(R.drawable.three_glass);
			fourGlass.setVisibility(View.VISIBLE);
			fourGlass.setImageResource(R.drawable.four_glass);
			fiveGlass.setVisibility(View.VISIBLE);
			fiveGlass.setImageResource(R.drawable.five_glass);
			blanksquare.setVisibility(View.VISIBLE);
			blanksquare.setImageResource(R.drawable.blanksquare);
			name1TextView.setVisibility(View.GONE);
			name2TextView.setVisibility(View.GONE);
			name3TextView.setVisibility(View.GONE);
			name4TextView.setVisibility(View.GONE);
			name5TextView.setVisibility(View.GONE);
			name6TextView.setVisibility(View.GONE);
			name7TextView.setVisibility(View.GONE);
			name8TextView.setVisibility(View.GONE);
			name9TextView.setVisibility(View.GONE);
			name10TextView.setVisibility(View.GONE);
			blanksquare.setVisibility(View.VISIBLE);
			blanksquare.setImageResource(R.drawable.blanksquare);
			wineName = name2TextView.getText();
			rateAnother.setVisibility(View.INVISIBLE);
			getRating.setVisibility(View.INVISIBLE);
		}
		if (v.getId() == R.id.name3Text)
		{
			text.setVisibility(View.VISIBLE);
			oneGlass.setVisibility(View.VISIBLE);
			oneGlass.setImageResource(R.drawable.one_glass);
			twoGlass.setVisibility(View.VISIBLE);
			twoGlass.setImageResource(R.drawable.two_glass);
			threeGlass.setVisibility(View.VISIBLE);
			threeGlass.setImageResource(R.drawable.three_glass);
			fourGlass.setVisibility(View.VISIBLE);
			fourGlass.setImageResource(R.drawable.four_glass);
			fiveGlass.setVisibility(View.VISIBLE);
			fiveGlass.setImageResource(R.drawable.five_glass);
			name1TextView.setVisibility(View.GONE);
			name2TextView.setVisibility(View.GONE);
			name3TextView.setVisibility(View.GONE);
			name4TextView.setVisibility(View.GONE);
			name5TextView.setVisibility(View.GONE);
			name6TextView.setVisibility(View.GONE);
			name7TextView.setVisibility(View.GONE);
			name8TextView.setVisibility(View.GONE);
			name9TextView.setVisibility(View.GONE);
			name10TextView.setVisibility(View.GONE);
			blanksquare.setVisibility(View.VISIBLE);
			blanksquare.setImageResource(R.drawable.blanksquare);
			wineName = name3TextView.getText();
			rateAnother.setVisibility(View.INVISIBLE);
			getRating.setVisibility(View.INVISIBLE);
		}
		if (v.getId() == R.id.name4Text)
		{
			text.setVisibility(View.VISIBLE);
			oneGlass.setVisibility(View.VISIBLE);
			oneGlass.setImageResource(R.drawable.one_glass);
			twoGlass.setVisibility(View.VISIBLE);
			twoGlass.setImageResource(R.drawable.two_glass);
			threeGlass.setVisibility(View.VISIBLE);
			threeGlass.setImageResource(R.drawable.three_glass);
			fourGlass.setVisibility(View.VISIBLE);
			fourGlass.setImageResource(R.drawable.four_glass);
			fiveGlass.setVisibility(View.VISIBLE);
			fiveGlass.setImageResource(R.drawable.five_glass);
			name1TextView.setVisibility(View.GONE);
			name2TextView.setVisibility(View.GONE);
			name3TextView.setVisibility(View.GONE);
			name4TextView.setVisibility(View.GONE);
			name5TextView.setVisibility(View.GONE);
			name6TextView.setVisibility(View.GONE);
			name7TextView.setVisibility(View.GONE);
			name8TextView.setVisibility(View.GONE);
			name9TextView.setVisibility(View.GONE);
			name10TextView.setVisibility(View.GONE);
			blanksquare.setVisibility(View.VISIBLE);
			blanksquare.setImageResource(R.drawable.blanksquare);
			wineName = name4TextView.getText();
			rateAnother.setVisibility(View.INVISIBLE);
			getRating.setVisibility(View.INVISIBLE);
		}
		if (v.getId() == R.id.name5Text)
		{
			text.setVisibility(View.VISIBLE);
			oneGlass.setVisibility(View.VISIBLE);
			oneGlass.setImageResource(R.drawable.one_glass);
			twoGlass.setVisibility(View.VISIBLE);
			twoGlass.setImageResource(R.drawable.two_glass);
			threeGlass.setVisibility(View.VISIBLE);
			threeGlass.setImageResource(R.drawable.three_glass);
			fourGlass.setVisibility(View.VISIBLE);
			fourGlass.setImageResource(R.drawable.four_glass);
			fiveGlass.setVisibility(View.VISIBLE);
			fiveGlass.setImageResource(R.drawable.five_glass);
			name1TextView.setVisibility(View.GONE);
			name2TextView.setVisibility(View.GONE);
			name3TextView.setVisibility(View.GONE);
			name4TextView.setVisibility(View.GONE);
			name5TextView.setVisibility(View.GONE);
			name6TextView.setVisibility(View.GONE);
			name7TextView.setVisibility(View.GONE);
			name8TextView.setVisibility(View.GONE);
			name9TextView.setVisibility(View.GONE);
			name10TextView.setVisibility(View.GONE);
			blanksquare.setVisibility(View.VISIBLE);
			blanksquare.setImageResource(R.drawable.blanksquare);
			wineName = name5TextView.getText();
			rateAnother.setVisibility(View.INVISIBLE);
			getRating.setVisibility(View.INVISIBLE);		}
		if (v.getId() == R.id.name6Text)
		{
			text.setVisibility(View.VISIBLE);
			oneGlass.setVisibility(View.VISIBLE);
			oneGlass.setImageResource(R.drawable.one_glass);
			twoGlass.setVisibility(View.VISIBLE);
			twoGlass.setImageResource(R.drawable.two_glass);
			threeGlass.setVisibility(View.VISIBLE);
			threeGlass.setImageResource(R.drawable.three_glass);
			fourGlass.setVisibility(View.VISIBLE);
			fourGlass.setImageResource(R.drawable.four_glass);
			fiveGlass.setVisibility(View.VISIBLE);
			fiveGlass.setImageResource(R.drawable.five_glass);
			name1TextView.setVisibility(View.GONE);
			name2TextView.setVisibility(View.GONE);
			name3TextView.setVisibility(View.GONE);
			name4TextView.setVisibility(View.GONE);
			name5TextView.setVisibility(View.GONE);
			name6TextView.setVisibility(View.GONE);
			name7TextView.setVisibility(View.GONE);
			name8TextView.setVisibility(View.GONE);
			name9TextView.setVisibility(View.GONE);
			name10TextView.setVisibility(View.GONE);
			blanksquare.setVisibility(View.VISIBLE);
			blanksquare.setImageResource(R.drawable.blanksquare);
			wineName = name6TextView.getText();
			rateAnother.setVisibility(View.INVISIBLE);
			getRating.setVisibility(View.INVISIBLE);		}
		if (v.getId() == R.id.name7Text)
		{
			text.setVisibility(View.VISIBLE);
			oneGlass.setVisibility(View.VISIBLE);
			oneGlass.setImageResource(R.drawable.one_glass);
			twoGlass.setVisibility(View.VISIBLE);
			twoGlass.setImageResource(R.drawable.two_glass);
			threeGlass.setVisibility(View.VISIBLE);
			threeGlass.setImageResource(R.drawable.three_glass);
			fourGlass.setVisibility(View.VISIBLE);
			fourGlass.setImageResource(R.drawable.four_glass);
			fiveGlass.setVisibility(View.VISIBLE);
			fiveGlass.setImageResource(R.drawable.five_glass);
			name1TextView.setVisibility(View.GONE);
			name2TextView.setVisibility(View.GONE);
			name3TextView.setVisibility(View.GONE);
			name4TextView.setVisibility(View.GONE);
			name5TextView.setVisibility(View.GONE);
			name6TextView.setVisibility(View.GONE);
			name7TextView.setVisibility(View.GONE);
			name8TextView.setVisibility(View.GONE);
			name9TextView.setVisibility(View.GONE);
			name10TextView.setVisibility(View.GONE);
			blanksquare.setVisibility(View.VISIBLE);
			blanksquare.setImageResource(R.drawable.blanksquare);
			wineName = name7TextView.getText();
			rateAnother.setVisibility(View.INVISIBLE);
			getRating.setVisibility(View.INVISIBLE);		}
		if (v.getId() == R.id.name8Text)
		{
			text.setVisibility(View.VISIBLE);
			oneGlass.setVisibility(View.VISIBLE);
			oneGlass.setImageResource(R.drawable.one_glass);
			twoGlass.setVisibility(View.VISIBLE);
			twoGlass.setImageResource(R.drawable.two_glass);
			threeGlass.setVisibility(View.VISIBLE);
			threeGlass.setImageResource(R.drawable.three_glass);
			fourGlass.setVisibility(View.VISIBLE);
			fourGlass.setImageResource(R.drawable.four_glass);
			fiveGlass.setVisibility(View.VISIBLE);
			fiveGlass.setImageResource(R.drawable.five_glass);
			name1TextView.setVisibility(View.GONE);
			name2TextView.setVisibility(View.GONE);
			name3TextView.setVisibility(View.GONE);
			name4TextView.setVisibility(View.GONE);
			name5TextView.setVisibility(View.GONE);
			name6TextView.setVisibility(View.GONE);
			name7TextView.setVisibility(View.GONE);
			name8TextView.setVisibility(View.GONE);
			name9TextView.setVisibility(View.GONE);
			name10TextView.setVisibility(View.GONE);
			blanksquare.setVisibility(View.VISIBLE);
			blanksquare.setImageResource(R.drawable.blanksquare);
			wineName = name8TextView.getText();
			rateAnother.setVisibility(View.INVISIBLE);
			getRating.setVisibility(View.INVISIBLE);		}
		if (v.getId() == R.id.name9Text)
		{
			text.setVisibility(View.VISIBLE);
			oneGlass.setVisibility(View.VISIBLE);
			oneGlass.setImageResource(R.drawable.one_glass);
			twoGlass.setVisibility(View.VISIBLE);
			twoGlass.setImageResource(R.drawable.two_glass);
			threeGlass.setVisibility(View.VISIBLE);
			threeGlass.setImageResource(R.drawable.three_glass);
			fourGlass.setVisibility(View.VISIBLE);
			fourGlass.setImageResource(R.drawable.four_glass);
			fiveGlass.setVisibility(View.VISIBLE);
			fiveGlass.setImageResource(R.drawable.five_glass);
			name1TextView.setVisibility(View.GONE);
			name2TextView.setVisibility(View.GONE);
			name3TextView.setVisibility(View.GONE);
			name4TextView.setVisibility(View.GONE);
			name5TextView.setVisibility(View.GONE);
			name6TextView.setVisibility(View.GONE);
			name7TextView.setVisibility(View.GONE);
			name8TextView.setVisibility(View.GONE);
			name9TextView.setVisibility(View.GONE);
			name10TextView.setVisibility(View.GONE);
			blanksquare.setVisibility(View.VISIBLE);
			blanksquare.setImageResource(R.drawable.blanksquare);
			wineName = name9TextView.getText();
			rateAnother.setVisibility(View.INVISIBLE);
			getRating.setVisibility(View.INVISIBLE);		}

		if (v.getId() == R.id.name10Text)
		{
			text.setVisibility(View.VISIBLE);
			oneGlass.setVisibility(View.VISIBLE);
			oneGlass.setImageResource(R.drawable.one_glass);
			twoGlass.setVisibility(View.VISIBLE);
			twoGlass.setImageResource(R.drawable.two_glass);
			threeGlass.setVisibility(View.VISIBLE);
			threeGlass.setImageResource(R.drawable.three_glass);
			fourGlass.setVisibility(View.VISIBLE);
			fourGlass.setImageResource(R.drawable.four_glass);
			fiveGlass.setVisibility(View.VISIBLE);
			fiveGlass.setImageResource(R.drawable.five_glass);
			name1TextView.setVisibility(View.GONE);
			name2TextView.setVisibility(View.GONE);
			name3TextView.setVisibility(View.GONE);
			name4TextView.setVisibility(View.GONE);
			name5TextView.setVisibility(View.GONE);
			name6TextView.setVisibility(View.GONE);
			name7TextView.setVisibility(View.GONE);
			name8TextView.setVisibility(View.GONE);
			name9TextView.setVisibility(View.GONE);
			name10TextView.setVisibility(View.GONE);
			blanksquare.setVisibility(View.VISIBLE);
			blanksquare.setImageResource(R.drawable.blanksquare);
			wineName = name10TextView.getText();
			rateAnother.setVisibility(View.INVISIBLE);
			getRating.setVisibility(View.INVISIBLE);		}
		
		if (v.getId() == R.id.one_glass)
		{
			text.setText("THank you for rating this wine!");
			////System.outprintln("b4       "+MainActivity.wineDB.getRating(wineName));
			////System.outprintln(wineName);
			MainActivity.wineDB.setRating(wineName,1);
			////System.outprintln("after         " + MainActivity.wineDB.getRating(wineName));	
			text.setText("Thank you for rating this wine!");
			oneGlass.setVisibility(View.GONE);
			twoGlass.setVisibility(View.GONE);
			threeGlass.setVisibility(View.GONE);
			fourGlass.setVisibility(View.GONE);
			fiveGlass.setVisibility(View.GONE);
			blanksquare.setVisibility(View.GONE);
			rateAnother.setVisibility(View.VISIBLE);
			getRating.setVisibility(View.VISIBLE);
			getRating.setVisibility(View.VISIBLE);
			


		}
		
		if (v.getId() == R.id.two_glass)
		{
			text.setText("THank you for rating this wine!");
			////System.outprintln("b4       "+MainActivity.wineDB.getRating(wineName));
			////System.outprintln(wineName);
			MainActivity.wineDB.setRating(wineName,2);
			////System.outprintln("after         " + MainActivity.wineDB.getRating(wineName));			
			text.setText("Thank you for rating this wine!");
			oneGlass.setVisibility(View.GONE);
			twoGlass.setVisibility(View.GONE);
			threeGlass.setVisibility(View.GONE);
			fourGlass.setVisibility(View.GONE);
			fiveGlass.setVisibility(View.GONE);
			blanksquare.setVisibility(View.GONE);
			rateAnother.setVisibility(View.VISIBLE);
			getRating.setVisibility(View.VISIBLE);

		}
		
		if (v.getId() == R.id.three_glass)
		{
			text.setText("THank you for rating this wine!");
			////System.outprintln("b4       "+MainActivity.wineDB.getRating(wineName));
			////System.outprintln(wineName);
			MainActivity.wineDB.setRating(wineName,3);
			////System.outprintln("after         " + MainActivity.wineDB.getRating(wineName));			
			text.setText("Thank you for rating this wine!");
			oneGlass.setVisibility(View.GONE);
			twoGlass.setVisibility(View.GONE);
			threeGlass.setVisibility(View.GONE);
			fourGlass.setVisibility(View.GONE);
			fiveGlass.setVisibility(View.GONE);
			blanksquare.setVisibility(View.GONE);
			rateAnother.setVisibility(View.VISIBLE);
			getRating.setVisibility(View.VISIBLE);

		}
		if (v.getId() == R.id.four_glass)
		{
			text.setText("THank you for rating this wine!");
			////System.outprintln("b4       "+MainActivity.wineDB.getRating(wineName));
			////System.outprintln(wineName);
			MainActivity.wineDB.setRating(wineName,4);
			////System.outprintln("after         " + MainActivity.wineDB.getRating(wineName));			
			text.setText("Thank you for rating this wine!");
			oneGlass.setVisibility(View.GONE);
			twoGlass.setVisibility(View.GONE);
			threeGlass.setVisibility(View.GONE);
			fourGlass.setVisibility(View.GONE);
			fiveGlass.setVisibility(View.GONE);
			blanksquare.setVisibility(View.GONE);
			rateAnother.setVisibility(View.VISIBLE);
			getRating.setVisibility(View.VISIBLE);
		}
		if (v.getId() == R.id.five_glass)
		{
			text.setText("THank you for rating this wine!");
			////System.outprintln("b4       "+ MainActivity.wineDB.getRating(wineName));
			////System.outprintln(wineName);
			MainActivity.wineDB.setRating(wineName,5);
			////System.outprintln("after         " + MainActivity.wineDB.getRating(wineName));			
			text.setText("Thank you for rating this wine!");
			oneGlass.setVisibility(View.GONE);
			twoGlass.setVisibility(View.GONE);
			threeGlass.setVisibility(View.GONE);
			fourGlass.setVisibility(View.GONE);
			fiveGlass.setVisibility(View.GONE);
			blanksquare.setVisibility(View.GONE);
			rateAnother.setVisibility(View.VISIBLE);
			getRating.setVisibility(View.VISIBLE);

		}
	}

}