package io.github.paulvi.rijksmuseumandroid;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class ReadJson {

	public static void main(String[] args) throws IOException {
		String sURL = "https://www.rijksmuseum.nl/api/en/collection?key=UQVLOfJR&format=json"
				+"&imgonly=True"
				+"&toppieces=True";
		log(sURL);

	    // Connect to the URL using java's native library
	    URL url = new URL(sURL);
	    HttpURLConnection request = (HttpURLConnection) url.openConnection();
	    request.connect();
	    
	    int artCount = 0;	    

	    JsonParser jp = new JsonParser(); //from gson
	    JsonElement answer = jp.parse(new InputStreamReader((InputStream) request.getContent())); //convert the input stream to a json element
	    log(answer.toString());
	    JsonObject rootobj = answer.getAsJsonObject(); //may be an array, may be an object. 
	    artCount=rootobj.get("count").getAsInt();
	    log("count="+artCount);
	    JsonArray artObjects = rootobj.get("artObjects").getAsJsonArray();
	    for (JsonElement el : artObjects){	    	
	    	JsonObject art = el.getAsJsonObject();
	    	String objectNumber = art.get("objectNumber").getAsString();
	    	String title = art.get("title").getAsString();
	    	String longTitle = art.get("longTitle").getAsString();
	    	log(String.format("%s\t%s\t%s",objectNumber, title, longTitle));
	    	
	    	Art artPeice = new Art();
	    	artPeice.objectNumber = objectNumber;
	    	artPeice.title = title;
	    	artPeice.longTitle = longTitle;
	    	
	    	ArtCollections.add(artPeice); 
	    }
	}

	private static void log(String s) {
		System.out.println(s);
	}

	public static void start() {
		Thread thread = new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					main(null);
				} catch (IOException e) {
					e.printStackTrace();
				}				
			}});
		thread.start();
	}

}
