package br.com.brixtal.simplewebcrawler.exceptions;

public class EmptyUrlException extends Exception {

	public EmptyUrlException() {
		super("An empty URL was inputted. Verify if a correct URL was setted.");
	}
}
