package it.demacs.Decorator.Pattern;

public class ContimenitiDecorator implements Pizza{
	
	protected Pizza p;
	
	public ContimenitiDecorator(Pizza p) {
		this.p = p;
	}

	@Override
	public void ordina() {
		this.p.ordina();
	}

}
