package br.com.brixtal.simplewebcrawler.main;

import java.util.Scanner;

import br.com.brixtal.simplewebcrawler.settings.Url;
import br.com.brixtal.simplewebcrawler.settings.WebCrawlerProperties;

public class WebCrawler {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		

		WebCrawlerProperties properties = new WebCrawlerProperties();
		if(properties.hasUrlSetted()) {
			System.out.println("Insert the URL to be crawled.");
			System.out.print("> ");
			String input = keyboard.nextLine();
			try {
				properties.setUrl(new Url(input));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
