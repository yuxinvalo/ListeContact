package com.example.listecontacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Presentation extends Activity {
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_contact);	      
}
	  public void sertext(View v){
		  
		  EditText XXX=(EditText) findViewById(R.id.editText2);
		
		 // XXX.setText(name);
	  }  
	 
	 
	   public void Ok(View v){
		   EditText edition=(EditText)findViewById(R.id.editText2);
		   String   str=edition.getText().toString();
		   if(str.length()==0){
			   setResult(RESULT_CANCELED);
		   }
	   }
	   
	   public void Annuler(View v){
		   setResult(RESULT_CANCELED);
		   finish();
	   }
	   
	   public void Portable(View v){}
	 
}