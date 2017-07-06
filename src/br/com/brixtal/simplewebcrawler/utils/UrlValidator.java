package br.com.brixtal.simplewebcrawler.utils;

import java.util.regex.Pattern;

public class UrlValidator {
	
	private static final String URL_PATTERN = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
	
	public static boolean isValidUrl(String url) {
		
		Pattern pattern = Pattern.compile(URL_PATTERN);
		System.out.println(pattern.matcher(url).matches());
		return pattern.matcher(url).matches();	
		
	}
}
