package it.demacs.Proxy.Pattern;

import javafx.scene.image.Image;

public class ProxyImg3 implements ProxyInterface {
	
	Image3 img;

	@Override
	public Image request() {
		img = new Image3();
		return img.request();
	}

}
