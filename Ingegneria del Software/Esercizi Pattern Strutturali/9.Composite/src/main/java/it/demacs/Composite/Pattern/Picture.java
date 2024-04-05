package it.demacs.Composite.Pattern;

import java.util.ArrayList;
import java.util.List;

public class Picture implements Grafica{
	List<Grafica> figli = new ArrayList<Grafica>();

	@Override
	public void Draw() {
		for(var a:figli) {
			System.out.println(a.getClass());
			//a.Draw();
		}
	}

	@Override
	public void Add(Grafica c) {
		figli.add(c);
	}

	@Override
	public void Remove(Grafica c) {
		figli.remove(c);
	}

	@Override
	public Grafica GetChildren(int n) {
		return figli.get(n);
		
	}
	
	
	
	
}
