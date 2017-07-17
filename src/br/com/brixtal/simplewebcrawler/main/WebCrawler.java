package br.com.brixtal.simplewebcrawler.main;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Scanner;

import br.com.brixtal.simplewebcrawler.code.Content;
import br.com.brixtal.simplewebcrawler.code.Tag;
import br.com.brixtal.simplewebcrawler.code.Url;
import br.com.brixtal.simplewebcrawler.settings.WebCrawlerProperties;
import br.com.brixtal.simplewebcrawler.utils.HtmlParser;
import br.com.brixtal.simplewebcrawler.utils.getHTMLFromURL;

public class WebCrawler {

	public static void main(String[] args) throws Exception {

		//Load settings or ask them to user.
		WebCrawlerProperties properties = new WebCrawlerProperties();		
		
		//Get HTML from URL
		Content content = new Content(getHTMLFromURL.getHtml(properties.getUrl()));

		//Create a list to receive all tags and contents extracted from HTML
		List<Tag> selectedTagAndContent;
		
		//Start parsing code
		HtmlParser parser = new HtmlParser();
		selectedTagAndContent = parser.getTags(content.getContent());
		
	}

}
