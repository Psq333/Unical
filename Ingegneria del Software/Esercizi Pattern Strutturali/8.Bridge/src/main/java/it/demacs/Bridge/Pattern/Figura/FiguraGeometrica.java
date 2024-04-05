package it.demacs.Bridge.Pattern.Figura;

import it.demacs.Bridge.Pattern.Pieno.FiguraGeometricaImp;
import javafx.scene.canvas.Canvas;

public abstract class FiguraGeometrica {
	
	protected FiguraGeometricaImp impl = null;
	
	public FiguraGeometrica(FiguraGeometricaImp impl) {
		this.impl = impl;
	}
	
	public abstract void disegna(Canvas can);
	
	
	
	
}
