package it.demacs.Composite.Pattern;

public interface Grafica {
	public void Draw();
	public void Add(Grafica c);
	public void Remove(Grafica c);
	public Grafica GetChildren(int n);
}
