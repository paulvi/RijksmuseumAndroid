package io.github.paulvi.rijksmuseumandroid;

/** some selected fields of JSON artObjects item */
public class Art {
	String objectNumber;
	String title;
	String longTitle;
	
	public String getTitle(){ return title;}
	
	public String getSmallImage() {
		return String.format("http://www.rijksmuseum.nl/media/assets/%s&200x200", objectNumber);
	}
	
	public String getImage() {
		return String.format("http://www.rijksmuseum.nl/media/assets/%s", objectNumber);
	}
}
