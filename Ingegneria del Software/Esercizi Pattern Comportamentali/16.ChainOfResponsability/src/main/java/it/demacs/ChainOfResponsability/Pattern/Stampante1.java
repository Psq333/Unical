package it.demacs.ChainOfResponsability.Pattern;

public class Stampante1 extends Stampante{
	
	
	public Stampante1() {
		successor = new Stampante2();
		piena = true;
	}

	@Override
	public void stampa() {
		if(piena)
			successor.stampa();
		else 
			System.out.println("Stampa con Stampa1");
	}
	
}
