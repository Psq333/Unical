package it.demacs.Decorator.Pattern;

public class Patatine extends ContimenitiDecorator {

	public Patatine(Pizza p) {
		super(p);
	}
	
	@Override
	public void ordina() {
		super.ordina();
		System.out.print(" -> Aggiunta patatine ");
	}

}
