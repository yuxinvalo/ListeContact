package com.example.contacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Presentation extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.presentation);
		//source on cherche la methode onCreate
	}

	
	public void Ok(View v){
		
	}
	
	
	public void Annuler(View v){
		setResult(RESULT_CANCELED);
		finish();
	}
	
	
	public void Fixe(View v){
		
	}
	
	public void Portable(View v){
		
	}

}
