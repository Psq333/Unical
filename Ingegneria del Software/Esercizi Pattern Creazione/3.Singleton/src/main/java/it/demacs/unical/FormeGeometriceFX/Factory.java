package it.demacs.unical.FormeGeometriceFX;

import it.demacs.unical.FormeGeometricheFX.Pattern.Cerchio;
import it.demacs.unical.FormeGeometricheFX.Pattern.FiguraGeometrica;
import it.demacs.unical.FormeGeometricheFX.Pattern.Quadrato;

public class Factory {
	
	@SuppressWarnings("exports")
	public static FiguraGeometrica oggetto(String k) {
		FiguraGeometrica f = null;
		switch (k) {
		case "Quadrato":
			f = Quadrato.getInstance();
			break;

		case "Cerchio":
			f =  Cerchio.getInstance();
			break;
		}
		return f;
	}
}
