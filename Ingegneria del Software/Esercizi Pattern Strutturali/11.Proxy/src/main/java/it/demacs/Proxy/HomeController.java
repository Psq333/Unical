package it.demacs.Proxy;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;

import it.demacs.Proxy.Pattern.Image1;
import it.demacs.Proxy.Pattern.ProxyImg1;
import it.demacs.Proxy.Pattern.ProxyImg2;
import it.demacs.Proxy.Pattern.ProxyImg3;
import it.demacs.Proxy.Pattern.ProxyImg4;
import it.demacs.Proxy.Pattern.ProxyImg5;
import it.demacs.Proxy.Pattern.ProxyInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HomeController {

    @FXML
    private ImageView img_viewer;

    @FXML
    private Button piu_button;

    @FXML
    private Button meno_button;
    
    List<ProxyInterface> proxy = new ArrayList<ProxyInterface>();
    int i = 0;
    
    public void initialize() {
    	proxy.add(new ProxyImg1());
    	proxy.add(new ProxyImg2());
    	proxy.add(new ProxyImg3());
    	proxy.add(new ProxyImg4());
    	proxy.add(new ProxyImg5());
	}

    @FXML
    void meno_clicked(ActionEvent event) {
    	i--;
    	if(i < 0) i = 4;
    	img_viewer.setImage(proxy.get(i).request());
    }

    @FXML
    void piu_clicked(ActionEvent event) {
    	i++;
    	if(i > 4) i = 0;
    	img_viewer.setImage(proxy.get(i).request());
    }

}

