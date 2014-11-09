package com.example.contacts;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ListContact extends ListFragment{
     
	private ContactAdapter adapter ;
	
	//créer un constructeur par défaut
		public ListContact(){
					
		}
		
		private void ajoutContactParDefaut(){
			Contacts cd = new Contacts("yuxin", "SHI", "0663316352", "no");
			adapter.add(cd);
		}
		 @Override
	     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			 
			 adapter = new ContactAdapter(getActivity()) ;
			 ajoutContactParDefaut();
			 setListAdapter(adapter) ;
			 
	         View rootView = inflater.inflate(R.layout.fragment_main, container, false);
	         return rootView;
	     }
		 
}
