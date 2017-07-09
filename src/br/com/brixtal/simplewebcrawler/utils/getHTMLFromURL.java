package br.com.brixtal.simplewebcrawler.utils;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import br.com.brixtal.simplewebcrawler.settings.Url;

public class getHTMLFromURL {

	
	/**
	 * 
	 * Function adapted from https://stackoverflow.com/questions/31462/how-to-fetch-html-in-java
	 * Thanks for user pek.
	 * 
	 */
	public String getHtml(Url url) {
		String content = null;
		URLConnection connection = null;
		try {
		  connection =  new URL(url.getUrl()).openConnection();
		  Scanner scanner = new Scanner(connection.getInputStream());
		  scanner.useDelimiter("\\Z");
		  content = scanner.next();
		}catch ( Exception ex ) {
		    ex.printStackTrace();
		}
		return content;
	}
	
}
