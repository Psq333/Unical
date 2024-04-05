package it.demacs.Proxy.Pattern;

import javafx.scene.image.Image;

public class ProxyImg2 implements ProxyInterface {
	
	Image2 img;

	@Override
	public Image request() {
		img = new Image2();
		return img.request();
	}

}
