package it.demacs.Strategy.Pattern;

import java.util.List;

public class Context {
	private Strategy strategy;
	private List<Integer> lista;
	public Context(Strategy strategy,List<Integer> lista) {
		this.strategy = strategy;
		this.lista = lista;
	}
	
	public void ordinamento() {
		strategy.stampaArray(lista);
	}
}
