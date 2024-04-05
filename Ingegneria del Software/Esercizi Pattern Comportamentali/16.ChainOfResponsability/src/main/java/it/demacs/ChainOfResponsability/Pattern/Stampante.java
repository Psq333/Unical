package it.demacs.ChainOfResponsability.Pattern;

public abstract class Stampante{
	public Stampante successor = null;
	boolean piena;
	public Stampante() {
	}
	public abstract void stampa();
}
