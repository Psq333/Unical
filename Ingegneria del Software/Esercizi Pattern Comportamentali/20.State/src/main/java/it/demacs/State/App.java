package it.demacs.State;

import it.demacs.State.Pattern.ConnessioneHTTP;
import it.demacs.State.Pattern.ConnessioneHTTPS;
import it.demacs.State.Pattern.ConnessioneLAN;
import it.demacs.State.Pattern.Context;
import it.demacs.State.Pattern.State;

public class App {
  public static void main(String[] args) {
	  State s;
	  //s = new ConnessioneHTTP();
	  //s = new ConnessioneHTTPS();
	  s = new ConnessioneLAN();
	  Context c = new Context(s);
	  c.apri();
	  c.controllo();
	  c.chiudi();
  }
}
