package it.demacs.Facade;

import it.demacs.Facade.Pattern.Compiler;
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
    
    @FXML
    void quadrato_clicked(ActionEvent event) {
    	Compiler c = new Compiler(canvas);
    }

    @FXML
    void cerchio_clicked(ActionEvent event) {
    }


}
