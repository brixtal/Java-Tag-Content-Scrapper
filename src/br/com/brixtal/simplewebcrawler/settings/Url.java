package br.com.brixtal.simplewebcrawler.settings;

import br.com.brixtal.simplewebcrawler.exceptions.EmptyUrlException;
import br.com.brixtal.simplewebcrawler.exceptions.InvalidUrlException;
import br.com.brixtal.simplewebcrawler.utils.UrlValidator;

public class Url {

	private String url;
	private boolean isSecureConnection = false; //Default value for http connections.

	
	public Url (String url) throws Exception {
		setUrl(url);		
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) throws Exception {
		if(url == null || url.trim().isEmpty()) throw new EmptyUrlException(); 
		if(!UrlValidator.isValidUrl(url)) throw new InvalidUrlException(); 
		this.url = url;
	}
	
	
	
}
