package it.demacs.unical.AbstractFactory;

import it.demacs.unical.AbstractFactory.Pattern.Cerchio;
import it.demacs.unical.AbstractFactory.Pattern.CerchioPieno;
import it.demacs.unical.AbstractFactory.Pattern.CerchioVuoto;
import javafx.scene.canvas.Canvas;

public class CerchioF implements AbstractFactory{
	
	Cerchio cerchio = null;
	
	@Override
	public void DisegnaPieno(Canvas c) {
		cerchio = new CerchioPieno();
		cerchio.Disegna(c);
	}

	@Override
	public void DisegnaVuoto(Canvas c) {
		cerchio = new CerchioVuoto();
		cerchio.Disegna(c);
	}

}
