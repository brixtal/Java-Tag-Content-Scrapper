package br.com.brixtal.simplewebcrawler.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.brixtal.simplewebcrawler.code.Tag;

public class HtmlParser {
	
	String tagContent = "";
	
	public void getTags(String content) {
		
		char[] contentAsChar = content.toCharArray();
		boolean isParameter = true;
		boolean isTagDefinition = false;
		List<Tag> tagList = new ArrayList<Tag>();
		
	/* TODO complete here! */	
		for (char c : contentAsChar) {
		    if (c == Tag.DEF_INIT) {
		    	isTagDefinition = true;
		    }
		    else if ((c == Tag.DEF_END || c == Tag.DEF_SLASH) && isTagDefinition) {
		    	isTagDefinition = false;
		    	tagList.add(new Tag(tagContent.trim()));
		    }
		    else if ()
		    	
		}
		
	}
	
	public String getTagContent() {
		return tagContent;
	}

	public void setTagContent(String tagContent) {
		this.tagContent = tagContent;
	}
	
	public void addTagContent(char c) {
		this.tagContent = this.tagContent.concat(String.valueOf(c));
	}
	
	public void clearTagContent() {
		this.tagContent = "";
	}

}
