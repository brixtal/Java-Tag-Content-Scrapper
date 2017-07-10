package br.com.brixtal.simplewebcrawler.exceptions;

import java.util.ResourceBundle;

import br.com.brixtal.simplewebcrawler.settings.Language;

public class HttpError404 extends Exception {

	static ResourceBundle labels = ResourceBundle.getBundle(Language.getCurrentLanguage());
	
	
	public HttpError404() {
		super(labels.getString("text.exception.404"));
	}
	
}
