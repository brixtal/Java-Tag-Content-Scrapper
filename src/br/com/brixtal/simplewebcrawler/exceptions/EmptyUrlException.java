package br.com.brixtal.simplewebcrawler.exceptions;

import java.util.ResourceBundle;

import br.com.brixtal.simplewebcrawler.settings.Language;

public class EmptyUrlException extends Exception {
	
	static ResourceBundle labels = ResourceBundle.getBundle(Language.getCurrentLanguage());

	public EmptyUrlException() {
		super(labels.getString("text.exception.null"));
	}
}
