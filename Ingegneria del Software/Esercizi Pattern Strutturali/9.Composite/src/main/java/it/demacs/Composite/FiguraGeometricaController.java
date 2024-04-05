package it.demacs.Composite;

import it.demacs.Composite.Pattern.Cerchio;
import it.demacs.Composite.Pattern.Picture;
import it.demacs.Composite.Pattern.Quadrato;
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
    
    Picture p = new Picture();
    
    @FXML
    void quadrato_clicked(ActionEvent event) {
    	Cerchio c = new Cerchio(canvas);
    	Quadrato q = new Quadrato(canvas);
    	
    	p.Add(c);
    	p.Add(q);
    	p.Draw();
    	
    }

    @FXML
    void cerchio_clicked(ActionEvent event) {
    	canvas.getGraphicsContext2D().clearRect(0,0,canvas.getWidth(), canvas.getHeight());
    	p.GetChildren(0).Draw();
    }


}
