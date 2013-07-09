package com.example.myfirstapp;

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

public class ScrollTest extends Activity implements OnClickListener {

	private Button firstButton;
	private TextView changingTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scroll_test);
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
               		
		}
		
		changingTextView.setText(term);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.scroll_test, menu);
		return true;
	}

}
