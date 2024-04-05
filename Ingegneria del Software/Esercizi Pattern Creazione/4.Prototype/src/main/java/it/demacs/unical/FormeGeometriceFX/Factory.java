package it.demacs.unical.FormeGeometriceFX;

import it.demacs.unical.FormeGeometricheFX.Pattern.Cerchio;
import it.demacs.unical.FormeGeometricheFX.Pattern.FiguraGeometrica;
import it.demacs.unical.FormeGeometricheFX.Pattern.Quadrato;

public class Factory {
	
	private static Quadrato quadratoPrototype = new Quadrato();
	private static Cerchio cerchioPrototype = new Cerchio();
	
	@SuppressWarnings("exports")
	public static FiguraGeometrica oggetto(String k) {
		FiguraGeometrica f = null;
		switch (k) {
		case "Quadrato":
			f = quadratoPrototype;
			//f = q.clone();
			break;

		case "Cerchio":
			f = cerchioPrototype;
			//f =  c.clone();
			break;
		}
		return f.clone();
	}
}
