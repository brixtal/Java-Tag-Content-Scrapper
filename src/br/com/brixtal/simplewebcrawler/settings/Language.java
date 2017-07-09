package br.com.brixtal.simplewebcrawler.settings;

public class Language {

	private static String currentLanguage = "pt_br";
	
	public Language() {
		
	}
	
	public Language(String language) {
		this.currentLanguage = language;
	}
	
	public static String getCurrentLanguage() {
		return currentLanguage;
	}
	
}
