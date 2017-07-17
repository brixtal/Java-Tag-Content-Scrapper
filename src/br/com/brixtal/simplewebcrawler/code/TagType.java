package br.com.brixtal.simplewebcrawler.code;

import java.util.ArrayList;
import java.util.List;

public class TagType {

	/* Tag's list to be read */
	public static final String TAG_A = "a";
	public static final String TAG_SPAM = "spam";
	public static final String TAG_P = "p";		
	public static final String TAG_IMG = "img";
	

	
	public List<String> getListofacceptedtags() {
		
		List<String> listOfAcceptedTags = new ArrayList<String>();
	
		listOfAcceptedTags.add(TAG_A);
		listOfAcceptedTags.add(TAG_IMG);
		listOfAcceptedTags.add(TAG_P);
		listOfAcceptedTags.add(TAG_SPAM);
		
		return listOfAcceptedTags;
	}
	
	
	
	//public static final String TAG_DIV = "div";
	//public static final String TAG_TABLE = "table";
	//public static final String TAG_HEAD = "head";
	//public static final String TAG_BODY = "body";
	//public static final String TAG_SCRIPT = "script";
	
}
