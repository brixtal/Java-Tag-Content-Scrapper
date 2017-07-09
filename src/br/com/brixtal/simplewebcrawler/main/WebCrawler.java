package br.com.brixtal.simplewebcrawler.main;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import br.com.brixtal.simplewebcrawler.settings.Content;
import br.com.brixtal.simplewebcrawler.settings.Url;
import br.com.brixtal.simplewebcrawler.settings.WebCrawlerProperties;
import br.com.brixtal.simplewebcrawler.utils.getHTMLFromURL;

public class WebCrawler {

	public static void main(String[] args) {

		//Load settings or ask them to user.
		WebCrawlerProperties properties = new WebCrawlerProperties();		
		
		//Get HTML from URL
		Content content = new Content(getHTMLFromURL.getHtml(properties.getUrl()));
		System.out.println(content.getContent());
		
	}

}
