package br.com.brixtal.simplewebcrawler.exceptions;

public class InvalidUrlException extends Exception {

	public InvalidUrlException() {
		super("A wrong URL was inputted. Verify if a correct URL was setted.");
	}
}
