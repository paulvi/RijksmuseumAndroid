/*******************************************************************************
 * Copyright 2011-2013 Sergey Tarasevich
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package io.github.paulvi.rijksmuseumandroid;

/**
 * @author Sergey Tarasevich (nostra13[at]gmail[dot]com)
 */
public final class Constants {

	public static final String[] IMAGES = new String[] {
		"http://www.rijksmuseum.nl/media/assets/SK-C-1368",
		"http://www.rijksmuseum.nl/media/assets/SK-C-5",
		"http://www.rijksmuseum.nl/media/assets/SK-C-216",
		"http://www.rijksmuseum.nl/media/assets/SK-C-211",
		"http://www.rijksmuseum.nl/media/assets/SK-A-2963",
		"http://www.rijksmuseum.nl/media/assets/SK-A-3841",
		"http://www.rijksmuseum.nl/media/assets/SK-A-1718",
		"http://www.rijksmuseum.nl/media/assets/SK-A-799",
		"http://www.rijksmuseum.nl/media/assets/BK-AM-33-C",
		"http://www.rijksmuseum.nl/media/assets/BK-AM-33-H",
		"http://www.rijksmuseum.nl/media/assets/BK-NM-3888",
		"http://www.rijksmuseum.nl/media/assets/BK-18305",
	};

	private Constants() {
	}

	public static class Config {
		public static final boolean DEVELOPER_MODE = false;
	}
	
	public static class Extra {
		public static final String FRAGMENT_INDEX = "com.nostra13.example.universalimageloader.FRAGMENT_INDEX";
		public static final String IMAGE_POSITION = "com.nostra13.example.universalimageloader.IMAGE_POSITION";
	}
}
