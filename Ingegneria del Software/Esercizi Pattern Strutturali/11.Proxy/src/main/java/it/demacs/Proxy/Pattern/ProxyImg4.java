package it.demacs.Proxy.Pattern;

import javafx.scene.image.Image;

public class ProxyImg4 implements ProxyInterface {
	
	Image4 img;

	@Override
	public Image request() {
		img = new Image4();
		return img.request();
	}

}
