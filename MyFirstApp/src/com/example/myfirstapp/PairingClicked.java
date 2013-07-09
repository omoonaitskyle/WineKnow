package com.example.myfirstapp;

import java.io.IOException;
import java.util.ArrayList;

import com.example.myfirstapp.util.DatabaseHelper;
import com.example.myfirstapp.util.DatabaseHelper.FOOD;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.database.Cursor;
import android.database.SQLException;

import java.util.Random;

public class PairingClicked extends Activity implements OnClickListener {
	
	private Random random;
	private ImageView whiteMeat;
	private ImageView redMeat;
	private ImageView fish;
	private ImageView veggies;
	private ImageView pasta;
	
	private ImageView cheese;
	private ImageView curedMeat;
	private ImageView richFish;
	private ImageView roastedVeggies;
	private ImageView sweets;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_pairing_clicked);
		
        //changingImageView = (ImageView) findViewById(R.id.wino_guy);

		//back = (Button) findViewById(R.id.back);
		//back.setVisibility(View.INVISIBLE);
        redMeat = (ImageView) findViewById(R.id.eat_red_meat);
        redMeat.setOnClickListener(this);
        whiteMeat = (ImageView) findViewById(R.id.eat_white_meat);
        whiteMeat.setOnClickListener(this);
        fish = (ImageView) findViewById(R.id.eat_fish);
        fish.setOnClickListener(this);
        veggies = (ImageView) findViewById(R.id.eat_veggies);
        veggies.setOnClickListener(this);
        pasta = (ImageView) findViewById(R.id.eat_breads);
        pasta.setOnClickListener(this);
       // cheese = (ImageView) findViewById(R.id.eat_cheese);
        //cheese.setOnClickListener(this);
        curedMeat = (ImageView) findViewById(R.id.eat_cured_meat);
        curedMeat.setOnClickListener(this);
        richFish = (ImageView) findViewById(R.id.eat_rich_fish);
        richFish.setOnClickListener(this);
        roastedVeggies = (ImageView) findViewById(R.id.eat_roasted_veggies);
        roastedVeggies.setOnClickListener(this);
        sweets = (ImageView) findViewById(R.id.eat_sweets);
        sweets.setOnClickListener(this);
     
		MainActivity.verifyOpen();
        
        /*
        wineDB = new DatabaseHelper(this);
        
        try {
        	wineDB.createDatabase();
        }
        catch (IOException e) {
        	//System.out.println("Unable to create database");
        }
        
        try {
        	wineDB.openDatabase();
        }
        catch (SQLException e) {
        	//System.out.println("Couldn't open database.");
        }
        */
        
        
	}

	//public Cursor findPair(FOOD food)
	public void findPair(FOOD food)
	{
		int num = 0;
		
		if( food == FOOD.SWEETS ) {
			num = 0;
		}
		else if( food == FOOD.CURED_MEAT ) {
			num = 1;
		}
		else if( food == FOOD.RED_MEAT ) {
			num = 2;
		}
		else if( food == FOOD.WHITE_MEAT ) {
			num = 3;
		}
		else if( food == FOOD.RICH_FISH ) {
			num = 4;
		}
		else if( food == FOOD.FISH ) {
			num = 5;
		}
		else if( food == FOOD.STARCHES ) {
			num = 6;
		}
		//else if( food == FOOD.CHEESE ) {
		//	num = 7;
		//}
		else if( food == FOOD.ROASTED_VEGETABLES ) {
			num = 8;
		}
		else if( food == FOOD.VEGETABLES ) {
			num = 9;
		}
		// Default to RED_MEAT
		else {
			num = 2;
		}
		
       	Intent intent = new Intent(this, DisplayPairingWine.class);
    	intent.putExtra( "num", num );
    	//System.out.println("Hello world");
    	startActivity(intent);
    	finish();
		
		
		ArrayList<String> alist = MainActivity.wineDB.getWines(food);
		Cursor c;
		
		// TODO - look into database (varietals)
		// BAD:
		// Sparking Wine
		// White Table Wine
		// Proseco
		// Marsanne
		// Pinot Grigio
		// Port
		// Gruner Vertliner
		// Sherry
		// Monastrell
		// Roussanne
		// Red Table Wine
		
		// Keep getting wines by varietal until a varietal with >0 wines is found
		do {
			//System.out.println("Inside loop");
			Random r = new Random();
			int index = r.nextInt(alist.size());
			String var = alist.get(index);
			//System.out.println(var);
			c = MainActivity.wineDB.getWinesByVarietal(var);
		} while( c.getCount() == 0 );
       	
		
		/*
		c.moveToFirst();
		String s = new String();
    	for(int i = 0; i < c.getColumnCount(); i++)
    	{
    		s += c.getString(i) + " ";
    	}
    	
		//System.out.println(s);
    	//System.out.println("??");
    	*/
		//return c;
	}
	
	public void onClick(View v) {
        //ImageView img = randomFactGenerator();
		// TODO Auto-generated method stub
		if (v.getId() == R.id.eat_red_meat)
		{
			findPair(FOOD.RED_MEAT);
			
		}
		if (v.getId() == R.id.eat_white_meat)
		{
			findPair(FOOD.WHITE_MEAT);
		}
		
		if (v.getId() == R.id.eat_veggies)
		{
			findPair(FOOD.VEGETABLES);
		}
		if (v.getId() == R.id.eat_fish)
		{
			findPair(FOOD.FISH);
		}
		if (v.getId() == R.id.eat_breads)
		{
			findPair(FOOD.STARCHES);
		}
		/*
		if (v.getId() == R.id.eat_cheese)
		{
			findPair(FOOD.SOFT_CHEESE);
			
		}
		//if (v.getId() == R.id.eat_cheese)
		//{
	//		findPair(FOOD.HARD_CHEESE);
			
	//	} */
		if (v.getId() == R.id.eat_cured_meat)
		{
			findPair(FOOD.CURED_MEAT);
		}
		
		if (v.getId() == R.id.eat_roasted_veggies)
		{
			findPair(FOOD.ROASTED_VEGETABLES);
		}
		if (v.getId() == R.id.eat_rich_fish)
		{
			findPair(FOOD.RICH_FISH);
		}
		if (v.getId() == R.id.eat_sweets)
		{
			findPair(FOOD.SWEETS);
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pairing_clicked, menu);
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
    
    public void reviewClicked(View view) {
       	Intent intent = new Intent(this, ReviewClicked.class);
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
    
    public void findPair(View view) {
       	Intent intent = new Intent(this, Help.class);
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
    
    
}
