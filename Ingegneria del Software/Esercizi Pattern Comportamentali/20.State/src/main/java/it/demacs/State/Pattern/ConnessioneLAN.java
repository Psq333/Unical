package it.demacs.State.Pattern;

public class ConnessioneLAN implements State{

	@Override
	public void connessione() {
		System.out.println("Connessione LAN");
	}

	@Override
	public void controlloConnession() {
		System.out.println("Coontrollo connessione LAN");
	}

	@Override
	public void chiuso() {
		System.out.println("Chiusura connessione LAN");
	}
}
