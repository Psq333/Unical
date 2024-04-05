package it.demacs.ChainOfResponsability.Pattern;

public class Stampante2 extends Stampante{
	
	public Stampante2() {
		successor = new Stampante3();
		piena = false;
	}


	@Override
	public void stampa() {
		if(piena)
			successor.stampa();
		else 
			System.out.println("Stampa con Stampa2");
	}

}
