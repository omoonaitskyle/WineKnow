package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.Random;
import android.widget.*;
import android.view.View.OnClickListener;


public class FactsClicked extends Activity implements OnClickListener {

	private ImageView firstButton;
	private TextView changingTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_facts_clicked);
        changingTextView = (TextView) findViewById(R.id.random_fact);
		firstButton = (ImageView) findViewById(R.id.wino_guy);
        firstButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
        String message = randomFactGenerator();
		// TODO Auto-generated method stub
		if (v.getId() == R.id.wino_guy)
			changingTextView.setText(message);
	}
   
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.facts_clicked, menu);
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
    
    public void home(View view) {
       	Intent intent = new Intent(this, MainActivity.class);
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

    public void help(View view) {
       	Intent intent = new Intent(this, Help.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
       	finish();
    }    
    /*
     * Random Fact Generator
     *
     * When the user clicks on a button, it generates a random fact
     */
    public static String randomFactGenerator()	{
    	
    		Random generator = new Random();
    		
    		//Generate a random int between 0 and 18
    		int rand = generator.nextInt(17);
    		String fact = new String("");
    		switch (rand) {

    		case 0: fact =  "In the early part of the twentieth century, the  drys  or the prohibitionists protested to eliminate the word wine from the college and school texts, including Roman and Greek literature. .";
    						break;

    		case 1: fact = "Women who drink two glasses of wine a day are more active in bed. In simple words, they enjoy sex better as compared to women who do not drink wine.";
    						break;

    		case 2: fact = "The flavour of young wine is known as aroma while a mature wine's flavor is like a bouquet.";
    						break;

    		case 3: fact = "A person who constantly talks about wine that she/he will open but never does, is popularly known as a cork-tease.";
    						break;

    		case 4: fact = "In ancient Greece, a person hosting the party would drink the wine first just to make sure it was healthy to drink and not poisoned. It was here that the popular phrase drinking to one's health arose. ";
    						break;

    		case 5: fact = "Except for the Book of Jonah, rest of the entire Biblical Old Testament talks about the wine.";
    						break;

    		case 6: fact = "You will be astonished to know that early Roman women were not allowed to drink wine. If their husbands found about their wine drinking, they had the liberty to kill them. In 194 B.C.,a divorce also happened due the same reason.";
    						break;

    		case 7: fact = "Since wine tasting is all about wine smelling, women of reproductive ages are better wine testers because they have better smell sense than men.";
    						break;

    		case 8: fact = "Speyer, a town in Germany is popular as the place where the oldest wine bottle was discovered in A.D. 325, inside one of the two Roman sarcophaguses. The bottle can be seen at the Germany s Historisches Museum der Pfalz.";
    						break;

    		case 9: fact = "Highest wine consumption was recorded in the cities of California, Florida and New York of United States of America. France, Italy and Spain are three largest wine producers in the world followed by California.";
    						break;

    		case 10: fact = "In their endeavour to dissipate the aroma of wine, wine testers twirl their wine glasses, often filling them up to only one third, in order to avoid splitting of wine during a twirl.";
    						break;

    		case 11: fact = "Drinking wine regularly helps you stay fit and healthy. It has also been found that drinking wine reduces the risk of gum diseases, Alzheimer s disease, stroke and heart diseases. So, the next time you drink wine, remember it s health benefits as well.";
    						break;

    		case 12: fact = "Make sure you never store wine in the kitchen because it is warm, and thus not an ideal place to store it. Moreover, refrigerators are also not the right place to store wines because even at the warm settings, they are very cold.";
    						break;

    		case 13: fact = "While tasting wine, leave the wine in your mouth for a second or two. Then, you can either spit it out in a spittoon or swallow it. A high quality wine not only tastes good but also has a long after-taste. On the other hand, a low quality wine would have a short after-taste.";
    						break;

    		case 14: fact = "Ripe and rich dark shades of wine such as the most golden whites, deepest & blackest reds are produced at places that have warmer climate, whereas less lush and lighter shades of wine like white wines are produced at cooler climates.";
    						break;

    		case 15: fact = "The European Union has decided that any sparkling wine produced outside France cannot be labelled as champagne.";
    						break;

    		case 16: fact = "Wine when combined with food offers a third flavour or  synergy . This makes your dining experience, a memorable one. When you plan lighter foods in meal, make sure you have light wines to serve and when you prepare heavy and rich food items, opt for heavier wines.";
    						break;

    		case 17: fact = "Women who drink excessive wine are at an increased risk of suffering from side effects of wine because the lining of the stomach needed to metabolise alcohol is less in them as compared to men.";
    						break;
    		}
    	
    	return fact;
    	}

}