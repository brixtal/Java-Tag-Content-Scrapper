package br.com.brixtal.simplewebcrawler.exceptions;

import java.util.ResourceBundle;

import br.com.brixtal.simplewebcrawler.settings.Language;

public class InvalidUrlException extends Exception {

	static ResourceBundle labels = ResourceBundle.getBundle(Language.getCurrentLanguage());
	
	public InvalidUrlException() {
		super(labels.getString("text.exception.invalid.url"));
	}
}
