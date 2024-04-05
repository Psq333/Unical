package it.demacs.Proxy.Pattern;


import javafx.scene.image.Image;

public class ProxyImg5 implements ProxyInterface {
	
	Image5 img;

	@Override
	public Image request() {
		img = new Image5();
		return img.request();
	}

}
