package it.demacs.unical.AbstractFactory;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

public class FiguraGeometricaController {

	
	 @FXML
	    private RadioButton quadrato_radio;

	    @FXML
	    private Button vai_btn;

	    @FXML
	    private Canvas canvas;

	    @FXML
	    private RadioButton vuoto_radio;

	    @FXML
	    private RadioButton cerchio_radio;

	    @FXML
	    private RadioButton pieno_radio;
	    AbstractFactory f;

	    @FXML
	    void vai_clicked(ActionEvent event) {
	    	System.out.println(cerchio_radio.isSelected());
	    	if(cerchio_radio.isSelected()) {
	    		f = new CerchioF();
	    		if(pieno_radio.isSelected())
	    			f.DisegnaPieno(canvas);
	    		else f.DisegnaVuoto(canvas);
	    	}
	    	else if(quadrato_radio.isSelected()) {
	    		f = new QuadratoF();
	    		if(pieno_radio.isSelected())
	    			f.DisegnaPieno(canvas);
	    		else f.DisegnaVuoto(canvas);
	    	}
	    	
	    	
	    		
	    }



}
