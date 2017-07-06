package br.com.brixtal.simplewebcrawler.settings;

public class WebCrawlerProperties {

	private Url url;
	
	
	public WebCrawlerProperties() {
		
	}


	public String getUrl() {
		return url.getUrl();
	}


	public void setUrl(Url url) {
		this.url = url;
	}
	
	public boolean hasUrlSetted() {
		return url == null;
	}
	
}
