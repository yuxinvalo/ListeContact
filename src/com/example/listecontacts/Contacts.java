package com.example.listecontacts;

import java.io.Serializable;

import android.media.Image;

public class Contacts implements Serializable {

	private final long SerialVersionUID= 1L;
	private String name, firstname ,mobilenum, telephonenum;
//	private String adr, email;
	//private Image protrait;
	
	public Contacts  (String name,String firstname,String mobilenum,String telephonenum){
		this.name=name;
		this.firstname=firstname;
		this.mobilenum=mobilenum;
		this.telephonenum=telephonenum;
	}
	
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
	
	public String getfirstname(){
		return firstname;
	}
	public void setfirstname(String firstname){
		this.firstname=firstname;
	}
	
	public String getmobilenum(){
		return mobilenum;
	}
	public void setmobilenum(String mobilenum){
		this.mobilenum=mobilenum;
	}
	
	public String gettelephonenum(){
		return telephonenum;
	}
	public void settelephonenum(String telephonenum){
		this.telephonenum=telephonenum;
	}
	
	
	public String toString(){
		String str="";
		str= firstname+" "+name;
		return str;
	}
}
