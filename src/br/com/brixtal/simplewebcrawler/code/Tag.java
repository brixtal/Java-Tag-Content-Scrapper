package br.com.brixtal.simplewebcrawler.code;

public class Tag {
	
	String definition;
	String tagClass;
	String tagId;
	String tagName;
	String tagStyle;
	String tagType;
	String tagHref;	
	String tagTitle;
	String tagAlt;
	String tagContent;
	
	
	public static final String TAG_A = "a";
	public static final String TAG_SPAM = "spam";
	public static final String TAG_P = "p";	
	public static final String TAG_DIV = "div";
	public static final String TAG_TABLE = "table";
	public static final String TAG_HEAD = "head";
	public static final String TAG_BODY = "body";
	public static final String TAG_SCRIPT = "script";
	public static final String TAG_IMG = "img";
	
	public static final char DEF_INIT = '<';
	public static final char DEF_END = '>';
	public static final char DEF_SLASH = '/';
	public static final char DEF_BLANK_SPACE = ' ';
	public static final char DEF_EQUALS = '=';
	
	public Tag (String definition) {
		this.definition = definition;
	}
	
	public static boolean isTagParameter(String tagContent2) {
		
		return false;
	}
	
	
	
	

}
