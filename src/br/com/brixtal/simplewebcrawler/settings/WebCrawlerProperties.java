package br.com.brixtal.simplewebcrawler.settings;

import java.util.ResourceBundle;
import java.util.Scanner;

public class WebCrawlerProperties {

	private Url url;
	
	ResourceBundle labels = ResourceBundle.getBundle(Language.getCurrentLanguage());
	
	public WebCrawlerProperties() {
		getUrl();
	}

	public Url getUrl() {
		if(hasUrlSetted()) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println(labels.getString("text.input.url"));
			System.out.print(labels.getString("char.wait.input"));
			String input = keyboard.nextLine();
			try {
				setUrl(new Url(input));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return url;
	}


	public void setUrl(Url url) {
		this.url = url;
	}
	
	public boolean hasUrlSetted() {
		return url == null;
	}	
}
