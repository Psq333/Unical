package it.demacs.Proxy.Pattern;

import javafx.scene.image.Image;

public class ProxyImg1 implements ProxyInterface {
	
	Image1 img;

	@Override
	public Image request() {
		img = new Image1();
		return img.request();
	}

}
