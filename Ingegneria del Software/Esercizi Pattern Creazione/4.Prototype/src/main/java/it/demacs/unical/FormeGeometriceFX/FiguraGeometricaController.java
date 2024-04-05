package it.demacs.unical.FormeGeometriceFX;

import it.demacs.unical.FormeGeometricheFX.Pattern.FiguraGeometrica;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;

public class FiguraGeometricaController {

	
    @FXML
    private Button quadrato_btn;

    @FXML
    private Canvas canvas;

    @FXML
    private Button cerchio_btn;
    
    FiguraGeometrica f;
    
    @FXML
    void quadrato_clicked(ActionEvent event) {
    	//f = new Quadrato();
    	f = Factory.oggetto("Quadrato");
    	f.Disegna(canvas);
    }

    @FXML
    void cerchio_clicked(ActionEvent event) {
    	//f = new Cerchio();
    	f = Factory.oggetto("Cerchio");
    	f.Disegna(canvas);
    }


}
