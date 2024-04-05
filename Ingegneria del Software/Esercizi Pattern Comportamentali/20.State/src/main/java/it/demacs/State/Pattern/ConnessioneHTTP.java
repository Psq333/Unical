package it.demacs.State.Pattern;

public class ConnessioneHTTP implements State{

	@Override
	public void connessione() {
		System.out.println("Connessione HTTP");
	}

	@Override
	public void controlloConnession() {
		System.out.println("Coontrollo connessione HTTP");
	}

	@Override
	public void chiuso() {
		System.out.println("Chiusura connessione HTTP");
	}
	

}
