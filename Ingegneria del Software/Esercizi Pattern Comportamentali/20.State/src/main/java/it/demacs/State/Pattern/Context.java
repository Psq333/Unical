package it.demacs.State.Pattern;

public class Context {
	private State state;
	public Context(State state) {
		this.state = state;
	}
	
	public void apri() {
		state.connessione();
	}
	
	public void controllo() {
		state.controlloConnession();
	}
	public void chiudi() {
		state.chiuso();
	}
}
