package it.demacs.Bridge;

import it.demacs.Bridge.Pattern.Figura.Cerchio;
import it.demacs.Bridge.Pattern.Figura.FiguraGeometrica;
import it.demacs.Bridge.Pattern.Figura.Quadrato;
import it.demacs.Bridge.Pattern.Pieno.FiguraGeometricaImp;
import it.demacs.Bridge.Pattern.Pieno.PienoImp;
import it.demacs.Bridge.Pattern.Pieno.VuotoImp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

public class FiguraGeometricaController {

	
    @FXML
    private Button quadrato_btn;

    @FXML
    private Canvas canvas;

    @FXML
    private Button cerchio_btn;
    
    @FXML
    private RadioButton vuoto_radio;
    
    @FXML
    private RadioButton pieno_radio;
    
    FiguraGeometricaImp imp;
    FiguraGeometrica f;
    
    @FXML
    void quadrato_clicked(ActionEvent event) {
    	if(vuoto_radio.isSelected())
    		imp = new VuotoImp();
    	if(pieno_radio.isSelected())
    		imp = new PienoImp();
    	f = new Quadrato(imp);
    	f.disegna(canvas);
    }

    @FXML
    void cerchio_clicked(ActionEvent event) {
    	if(pieno_radio.isSelected())
    		imp = new PienoImp();
    	if(vuoto_radio.isSelected())
    		imp = new VuotoImp();
    	f = new Cerchio(imp);
    	f.disegna(canvas);
    }


}
