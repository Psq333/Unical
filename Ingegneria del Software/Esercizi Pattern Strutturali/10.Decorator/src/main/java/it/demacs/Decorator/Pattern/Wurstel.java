package it.demacs.Decorator.Pattern;

public class Wurstel extends ContimenitiDecorator {

	public Wurstel(Pizza p) {
		super(p);
	}
	
	@Override
	public void ordina() {
		super.ordina();
		System.out.print(" -> Aggiunta wustel ");
	}
}
