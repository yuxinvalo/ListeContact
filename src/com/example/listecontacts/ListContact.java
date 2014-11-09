package com.example.listecontacts;


import android.annotation.SuppressLint;
import android.app.Presentation;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;


public class ListContact extends ListFragment{
     
	private ContactAdapter adapter ;
	
	//cr閑r un constructeur par d閒aut
		public ListContact(){
					
		}
		
		private void ajoutContactParDefaut(){
			Contacts cd = new Contacts("yuxin", "SHI", "0663316352", "no");
			adapter.add(cd);
			Contacts ce = new Contacts("qqqq", "SHI", "0663316352", "no");
			adapter.add(ce);
			Contacts cdf = new Contacts("aaaaa", "SHI", "0663316352", "no");
			adapter.add(cdf);
		}
		
		
		  
		 @Override
	     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			 
			 adapter = new ContactAdapter(getActivity()) ;
			 ajoutContactParDefaut();
			 setListAdapter(adapter) ;
			 
	         View rootView = inflater.inflate(R.layout.fragment_main, container, false);
	         return rootView;
	     }

		 //重要方法：设置点击以后出现的动作，以下除了第一个显示Toast的方法以外会跳转到第二个页面的动作。
		@Override
		public void onListItemClick(ListView l, View v, int position, long id) {
			Contacts banana = adapter.get(position);
			Toast.makeText(getActivity(), banana.getname(), Toast.LENGTH_SHORT).show();
			Intent monIntent = new Intent(getActivity(),ContactActivity.class);
	    	monIntent.putExtra("nom", banana.getname());
	    	
	    	startActivityForResult(monIntent,1);  
			super.onListItemClick(l, v, position, id);
			
		}
		
	/*	public void onActivityResult(int requestCode, int resultCode, Intent monIntent){
			String name = monIntent.getStringExtra(name);
			String firstname = monIntent.getStringExtra(firstname);
			if(requestCode == 1){
				if(resultCode == RESULT_OK){
					Toast.makeText(this, name+" "+firstname, Toast.LENGTH_SHORT).show();
				}
				
				
			}
		}*/
		 
//这里是笔记，写完以后要删：onCreate 和 onCreateView 都要加入   EditText XXX=findViewById(R.id.editText);
		//                                       XXX.setText(n);
		 
}
