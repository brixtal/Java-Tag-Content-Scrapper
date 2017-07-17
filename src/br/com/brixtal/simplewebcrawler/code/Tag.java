package br.com.brixtal.simplewebcrawler.code;

public class Tag {
	
	String tag;
	String tagContent;

	public static final String DEF_INIT = "<";
	public static final String DEF_END = ">";
	public static final String DEF_SLASH = "/";
	public static final String DEF_SPACE = " ";
	public static final String DEF_EQUALS = "=";
	public String getTag() {
		return tag; 
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getTagContent() {
		return tagContent;
	}
	public void setTagContent(String tagContent) {
		this.tagContent = tagContent;
	}
	
	
	
	

}
