package br.com.brixtal.simplewebcrawler.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import br.com.brixtal.simplewebcrawler.code.Tag;
import br.com.brixtal.simplewebcrawler.code.TagType;

public class HtmlParser {

	public List<Tag> getTags(String htmlCode) {

		List<String> selectedTags = new ArrayList<String>();
		List<String> splitedTagAndContent = new ArrayList<String>();
		List<Tag> formattedTagAndContent = new ArrayList<Tag>();
		
		String[] tagsIntoHTML = htmlCode.split(Tag.DEF_INIT);

		for(String tag : tagsIntoHTML) {
			if(acceptedTags(tag)) {
				selectedTags.add(tag);
			}
		}

		for(String c : selectedTags) {			
			splitedTagAndContent.addAll(Arrays.asList(c.split(Tag.DEF_END)));
		}

		formattedTagAndContent = separateTagAndContent(splitedTagAndContent);
		
		return formattedTagAndContent;
	}

	public boolean acceptedTags(String tag) {
		TagType listOfAcceptedTags = new TagType();
		for(String acceptedTag : listOfAcceptedTags.getListofacceptedtags()) {
			if(tag.startsWith(acceptedTag)) {
				return true;
			}
		}		
		return false;
	}

	public List<Tag> separateTagAndContent (List<String> tagAndContent) {
		
		List<Tag> formattedTagAndContent = new ArrayList<Tag>();
		
		for(int i = 0; i < tagAndContent.size() ; i++) {
			Tag tag = new Tag(); 
			
			String tagType = tagAndContent.get(i).trim();
			
			tag.setTag(tagType);			
			
			if(!acceptedTags(tagAndContent.get(i+1))) {
				String contentTag = tagAndContent.get(i+1).trim();
				tag.setTagContent(contentTag);				
				i++;
			}
			
			formattedTagAndContent.add(tag);
		}
		
		return formattedTagAndContent;
	}

}
