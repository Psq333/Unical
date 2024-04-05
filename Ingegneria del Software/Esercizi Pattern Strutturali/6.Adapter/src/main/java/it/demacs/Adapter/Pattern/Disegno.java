package it.demacs.Adapter.Pattern;

import javafx.scene.canvas.Canvas;

public class Disegno {

	public void disegna(Canvas can, int x, int y, int x1,int y1) {
		can.getGraphicsContext2D().strokeLine(x, y, x1, y1);
	}
}
