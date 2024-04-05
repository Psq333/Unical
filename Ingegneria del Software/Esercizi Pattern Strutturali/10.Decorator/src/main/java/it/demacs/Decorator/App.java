package it.demacs.Decorator;

import it.demacs.Decorator.Pattern.Patatine;
import it.demacs.Decorator.Pattern.PizzaMargherita;
import it.demacs.Decorator.Pattern.Wurstel;

public class App {
  public static void main(String[] args) {
	  Patatine p = new Patatine(new PizzaMargherita());
	  p.ordina();
	  
	  System.out.println();
	  Wurstel w = new Wurstel(new Patatine(new PizzaMargherita()));
	  w.ordina();
	  
	  System.out.println();
	  PizzaMargherita pizza = new PizzaMargherita();
	  pizza.ordina();
	  
  }
}
