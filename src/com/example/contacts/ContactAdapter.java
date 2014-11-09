package com.example.contacts;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

public class ContactAdapter extends BaseAdapter{
	
	//private Contacts[] firstcontacts;
	private ArrayList<Contacts> firstcontacts = new ArrayList<Contacts>();
	private Context context;
	
	
	public ContactAdapter(Context context){
		this.context=context;
	}
  
	

	public boolean add(Contacts object) {
		return firstcontacts.add(object);
	}


	public void clear() {
		firstcontacts.clear();
	}


	public Contacts get(int index) {
		return firstcontacts.get(index);
	}


	public Contacts set(int index, Contacts object) {
		return firstcontacts.set(index, object);
	}


	public int size() {
		return firstcontacts.size();
	}



	@Override
	public int getCount() {
		
		return firstcontacts.size();
	} 
	
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return firstcontacts.get(position);
	}
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView==null){
			LayoutInflater inflater = (LayoutInflater) context.getSystemService (Context.LAYOUT_INFLATER_SERVICE); 
			convertView = inflater.inflate(R.layout.presentation, null);
		}
		
		// Récupération de l’item à la position
       Contacts val = firstcontacts.get(position);
		
		// Récupération du composant (ici un TextView) 
		EditText itemView = (EditText) convertView.findViewById(R.id.editText1);
			
		// Mise en place de l’affichage 
		itemView.setText(val.toString());
		return convertView;
		
	}

}
