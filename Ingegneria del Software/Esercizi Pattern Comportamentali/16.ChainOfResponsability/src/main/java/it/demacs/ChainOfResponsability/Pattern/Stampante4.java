package it.demacs.ChainOfResponsability.Pattern;

public class Stampante4 extends Stampante{
	
	public Stampante4() {
		piena = true;
	}

	@Override
	public void stampa() {
		if(piena)
			System.out.println("Stampanti tutte piene");
		else 
			System.out.println("Stampa con Stampa4");
	}
}
