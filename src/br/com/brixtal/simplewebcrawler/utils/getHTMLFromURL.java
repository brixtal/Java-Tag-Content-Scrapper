package br.com.brixtal.simplewebcrawler.utils;

import java.io.FileNotFoundException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import br.com.brixtal.simplewebcrawler.exceptions.HttpError404;
import br.com.brixtal.simplewebcrawler.settings.Url;

public class getHTMLFromURL {
	
	/**
	 * 
	 * Function adapted from https://stackoverflow.com/questions/31462/how-to-fetch-html-in-java
	 * Thanks for user pek.
	 * @throws Exception 
	 * 
	 */
	
	/* TODO Make other exceptions handling */
	
	public static String getHtml(Url url) throws Exception {
		String content = null;
		URLConnection connection = null;
		try {
		  connection =  new URL(url.getUrl()).openConnection();
		  Scanner scanner = new Scanner(connection.getInputStream());
		  scanner.useDelimiter("\\Z");
		  content = scanner.next();
		} catch (FileNotFoundException e) {
			throw new HttpError404();
		}
		catch ( Exception ex ) {
		    ex.printStackTrace();
		}
		return content;
	}
	
}
