package it.demacs.Proxy.Pattern;

import javafx.scene.image.Image;

public class Image1 implements ProxyInterface {
	
	public String url;
	

	@Override
	public Image request() {
		return new Image(getClass().getResourceAsStream("/image/index1.jpg"));
	}
	
	

}
