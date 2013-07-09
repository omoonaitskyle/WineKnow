package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.example.myfirstapp.R.drawable;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.*;
import java.lang.Object;
import com.example.myfirstapp.R.drawable;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.*;
import java.lang.Object;

import com.example.myfirstapp.R.drawable;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.*;
import java.lang.Object;

import com.example.myfirstapp.R.drawable;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.*;
import java.lang.Object;


public class TermsClicked extends Activity implements OnClickListener{

	private Button firstButton;
	private TextView changingTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_terms_clicked);
		
        changingTextView = (TextView) findViewById(R.id.fact);
        
		firstButton = (Button) findViewById(R.id.acidity);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.blend);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.blush);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.body);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.breathe);
        firstButton.setOnClickListener(this);
        
        
		firstButton = (Button) findViewById(R.id.cap);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.corked);
        firstButton.setOnClickListener(this);
        
        
		firstButton = (Button) findViewById(R.id.decant);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.disgorge);
        firstButton.setOnClickListener(this);
        
        firstButton = (Button) findViewById(R.id.earthy);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.enology);
        firstButton.setOnClickListener(this);
        
        
		firstButton = (Button) findViewById(R.id.fining);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.fumeblanc);
        firstButton.setOnClickListener(this);


		firstButton = (Button) findViewById(R.id.graft);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.grenache);
        firstButton.setOnClickListener(this);
        
        
		firstButton = (Button) findViewById(R.id.haut);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.hectare);
        firstButton.setOnClickListener(this);

        firstButton = (Button) findViewById(R.id.icewine);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.jeroboam);
        firstButton.setOnClickListener(this);
        
        
		firstButton = (Button) findViewById(R.id.kabinett);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.kosher);
        firstButton.setOnClickListener(this);

		firstButton = (Button) findViewById(R.id.labrusca);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.lees);
        firstButton.setOnClickListener(this);

		firstButton = (Button) findViewById(R.id.maderized);
        firstButton.setOnClickListener(this);

		firstButton = (Button) findViewById(R.id.malolactic);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.negociant);
        firstButton.setOnClickListener(this);

		firstButton = (Button) findViewById(R.id.nose);
        firstButton.setOnClickListener(this);

        firstButton = (Button) findViewById(R.id.oaky);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.oxidized);
        firstButton.setOnClickListener(this);

		firstButton = (Button) findViewById(R.id.phylloxera);
        firstButton.setOnClickListener(this);

		firstButton = (Button) findViewById(R.id.plonk);
        firstButton.setOnClickListener(this);

		firstButton = (Button) findViewById(R.id.racking);
        firstButton.setOnClickListener(this);

        firstButton = (Button) findViewById(R.id.rhone);
        firstButton.setOnClickListener(this);

		firstButton = (Button) findViewById(R.id.steely);
        firstButton.setOnClickListener(this);

		firstButton = (Button) findViewById(R.id.stemmy);
        firstButton.setOnClickListener(this);

		firstButton = (Button) findViewById(R.id.tannins);
        firstButton.setOnClickListener(this);

        firstButton = (Button) findViewById(R.id.terroir);
        firstButton.setOnClickListener(this);



		firstButton = (Button) findViewById(R.id.trocken);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.vintage);
        firstButton.setOnClickListener(this);
        
        
		firstButton = (Button) findViewById(R.id.viticulture);
        firstButton.setOnClickListener(this);
        
		firstButton = (Button) findViewById(R.id.yeast);
        firstButton.setOnClickListener(this);

                        firstButton = (Button) findViewById(R.id.yield);
        firstButton.setOnClickListener(this);

                        firstButton = (Button) findViewById(R.id.zinfandel);
        firstButton.setOnClickListener(this);


        
        
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String term = "";
		
		switch (v.getId()) {

		case R.id.acidity: term = "Acidity - A naturally occurring component of every wine; the level of perceived sharpness; a key element to a wine's longevity; a leading determinant of balance.";
							break;

        case R.id.blend: term = "Blend - The process whereby two or more grape varieties are combined after separate fermentation; common blends include Cotes de Rhone and red and white Bordeaux.";
        break;
        
        case R.id.blush: term = "Blush - A wine made from red grapes but which appears pink or salmon in color because the grape skins were removed from the fermenting juice before more color could be imparted; more commonly referred to as rose.";
        break;
        
        case R.id.body: term = "Body - The impression of weight on one's palate; light, medium, and full are common body qualifiers.";
        break;
        
        case R.id.breathe: term = "Breathe - The process of letting a wine open up via the introduction of air";
        break;
        
        case R.id.cap: term = "Cap - Grape solids like pits, skins, and stems that rise to the top of a tank during fermentation; what gives red wines color, tannins and weight.";
        break;
        
        case R.id.corked: term = "Corked - A wine with musty, mushroomy aromas and flavors resulting from a cork tainted by TCA (trichloroanisol).";
        break;
        
        case R.id.decant: term = "Decant - The process of transferring wine from a bottle to another holding vessel. The purpose is generally to aerate a young wine or to separate an older wine from any sediment.";
        break;
        
        case R.id.disgorge: term = "Disgorge - The process by which final sediments are removed from traditionally made sparkling wines prior to the adding of the dosage.";
        break;
        
        case R.id.earthy: term = "Earthy - A term used to describe aromas and flavors that have a certain soil-like quality.";
        break;
        
        case R.id.enology: term = "Enology - The science of wine production; an enologist is a professional winemaker; an enophile is someone who enjoys wine.";
        break;
        
        case R.id.fining: term = "Fining - Part of the clarification process whereby elements are added to the wine, i.e. egg whites, in order to capture solids prior to filtration.";
        break;

         case R.id.fumeblanc: term = "Fume Blanc - A name created by Robert Mondavi to describe dry Sauvignon Blanc.";
        break;
        
        case R.id.graft: term = "Graft - A vineyard technique in which the bud-producing part of a grapevine is attached to an existing root.";
        break;
        
        case R.id.grenache: term = "Grenache - A hearty, productive red grape popular in southern France as well as in Spain, where it is called Garnacha.";
        break;

case R.id.haut: term = "Haut - A French word meaning 'high.' It applies to quality as well as altitude.";
        break;
        
        case R.id.hectare: term = "Hectare - A metric measure equal to 10,000 square meters or 2.47 acres.";
        break;
        
        case R.id.icewine: term = "Ice Wine - From the German eiswein, this is a wine made from frozen grapes; Germany, Austria and Canada are leading ice wine producers.";
        break;

         case R.id.jeroboam: term = "Jeroboam - An oversized bottle equal to six regular 750 ml bottles.";
        break;
        
        case R.id.kabinett: term = "Kabinett - A German term for a wine of quality; usually the driest of Germany is best Rieslings.";
        break;
        
        case R.id.kosher: term = "Kosher - A wine made according to strict Jewish rules under rabbinical supervision.";
        break;

         case R.id.labrusca: term = "Labrusca - Grape types native to North America such as Concord and Catawba.";
        break;
        
        case R.id.lees: term = "Lees - Heavy sediment left in the barrel by fermenting wines; a combination of spent yeast cells and grape solids.";
        break;

         case R.id.maderized: term = "Maderized - Stemming from the word Madeira, this term means oxidization in a hot environment..";
        break;
        
        case R.id.malolactic: term = "Malolactic Fermentation - A secondary fermentation, often occurring in barrels, whereby harsher malic acid is converted into creamier lactic acid.";
        break;
        
        case R.id.negociant: term = "Negociant - A French term for a person or company that buys wines from others and then labels it under his or her own name; stems from the French word for 'shipper.'";
        break;

        case R.id.nose: term = "Nose - Synonymous with bouquet; the sum of a wine's aromas";
        break;

         case R.id.oaky: term = "Oaky - A term used to describe woody aromas and flavors; butter, popcorn, and toast notes are found in 'oaky' wines.";
        break;
        
        case R.id.oxidized: term = "Oxidized - A wine that is no longer fresh because it was exposed to too much air.";
        break;
        
        case R.id.phylloxera: term = "Phylloxera - A voracious vine louse that over time has destroyed vineyards in Europe and California.";
        break;

         case R.id.plonk: term = "Plonk - A derogatory name for cheap, poor-tasting wine.";
        break;
        
        case R.id.racking: term = "Racking - The process of moving wine from barrel to barrel, while leaving sediment behind.";
        break;
        
        case R.id.rhone: term = "Rhone - A river in southwest France surrounded by villages producing wines mostly from Syrah; the name of the wine-producing valley in France.";
        break;


        case R.id.steely: term = "Steely - A term used to describe an extremely crisp, acidic wine that was not aged in barrels.";
        break;
        
        case R.id.stemmy: term = "Stemmy - A term used to describe harsh, green characteristics in a wine.";
        break;

         case R.id.tannins: term = "Tannins - Phenolic compounds that exist in most plants; in grapes, tannins are found primarily in the skins and pits; tannins are astringent and provide structure to a wine; over time tannins die off, making wines less harsh.";
        break;
        
        case R.id.terroir: term = "Terroir - A French term for the combination of soil, climate, and all other factors that influence the ultimate character of a wine.";
        break;

         case R.id.trocken: term = "Trocken - German for 'dry.'";
        break;
        
        case R.id.vintage: term = "Vintage - A particular year in the wine business; a specific harvest.";
        break;
        
        case R.id.viticulture: term = "Viticulture - The science and business of growing wine grapes.";
        break;


        case R.id.yeast: term = "Yeast - Organisms that issue enzymes that trigger the fermentation process; yeasts can be natural or commercial.";
        break;
        
        case R.id.yield: term = "Yield - The amount of grapes harvested in a particular year..";
        break;

        case R.id.zinfandel: term = "Zinfandel - A popular grape in California of disputed origin; scientists say it is related to grapes in Croatia and southern Italy.";
        break;

               		
		}
		
		changingTextView.setText(term);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.terms_clicked, menu);
		return true;
	}

	//getMenuInflater().inflate(R.menu.terms_clicked, menu);


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
    
    public void help(View view) {
       	Intent intent = new Intent(this, Help.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    	finish();
    }    

}
