package it.demacs.Adapter;

import it.demacs.Adapter.Pattern.FiguraGeometrica;
import it.demacs.Adapter.Pattern.Quadrato;
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
    	FiguraGeometrica g = new Quadrato();
    	g.Disegna(canvas);
    }

    @FXML
    void cerchio_clicked(ActionEvent event) {
    }


}
