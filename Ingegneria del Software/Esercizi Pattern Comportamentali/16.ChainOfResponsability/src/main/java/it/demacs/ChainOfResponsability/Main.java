package it.demacs.ChainOfResponsability;

import it.demacs.ChainOfResponsability.Pattern.Stampante;
import it.demacs.ChainOfResponsability.Pattern.Stampante1;

public class Main {
	public static void main(String[] args) {
		Stampante s = new Stampante1();
		s.stampa();
	}
	
}
