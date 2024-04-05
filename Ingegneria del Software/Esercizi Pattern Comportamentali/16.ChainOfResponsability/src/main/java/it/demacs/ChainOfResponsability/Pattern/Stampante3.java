package it.demacs.ChainOfResponsability.Pattern;

public class Stampante3 extends Stampante{
	
	public Stampante3() {
		successor = new Stampante4();
		piena = true;
	}


	@Override
	public void stampa() {
		if(piena)
			successor.stampa();
		else 
			System.out.println("Stampa con Stampa3");
	}
}
