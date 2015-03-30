package io.github.paulvi.rijksmuseumandroid;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import android.util.Log;


public class ArtCollections {
	
//	"http://www.rijksmuseum.nl/media/assets/SK-A-447&100x100",
//	"http://www.rijksmuseum.nl/media/assets/SK-A-500&100x100",
//	"http://www.rijksmuseum.nl/media/assets/SK-C-229&100x100",
//	"http://www.rijksmuseum.nl/media/assets/SK-A-404&100x100",
//	"http://www.rijksmuseum.nl/media/assets/SK-C-109&100x100",
//	"http://www.rijksmuseum.nl/media/assets/SK-A-3580&100x100",
//	"http://www.rijksmuseum.nl/media/assets/SK-A-3059&100x100",
//	"http://www.rijksmuseum.nl/media/assets/SK-A-3148&100x100",
//	"http://www.rijksmuseum.nl/media/assets/BK-1975-81&100x100",
	
	private static final String TAG = "ArtCollections";

	List<Art> list = new LinkedList<Art>();
	//{{
//		add(new Art(){{
//			objectNumber = title = "SK-A-447";
//		}});
//		add(new Art(){{
//			objectNumber = title = "SK-C-109";
//		}});
//		add(new Art(){{
//			objectNumber = title = "BK-1975-81";
//		}});
//	}};
	
	private static ArtCollections instance = null;
	
	private static ArtCollections getInstance() {
		if (instance==null){
			instance = new ArtCollections();
			
			ReadJson.start();
		}
		return instance;
	}

	public static void add(Art art){
		getInstance().list.add(art);
	}

	public static List<Art> getList() {
		return getInstance().list;
	}

}
