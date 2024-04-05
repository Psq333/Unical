package it.demacs.State.Pattern;

public class ConnessioneHTTPS implements State{

	@Override
	public void connessione() {
		System.out.println("Connessione HTTPS");
	}

	@Override
	public void controlloConnession() {
		System.out.println("Coontrollo connessione HTTPS");
	}

	@Override
	public void chiuso() {
		System.out.println("Chiusura connessione HTTPS");
	}
}
