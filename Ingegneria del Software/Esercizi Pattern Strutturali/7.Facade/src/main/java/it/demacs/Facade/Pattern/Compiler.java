package it.demacs.Facade.Pattern;

import javafx.scene.canvas.Canvas;

public class Compiler {
	public Compiler(Canvas can) {
		FiguraGeometrica f = new Quadrato();
		f.Disegna(can);
	}
}
