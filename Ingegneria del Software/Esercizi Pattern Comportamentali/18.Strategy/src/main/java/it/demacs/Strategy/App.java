package it.demacs.Strategy;

import java.util.ArrayList;
import java.util.List;

import it.demacs.Strategy.Pattern.Context;
import it.demacs.Strategy.Pattern.OrdinamenteDecrescente;
import it.demacs.Strategy.Pattern.OrdinamentoCrescente;
import it.demacs.Strategy.Pattern.OrdinamentoCrescenteDecrescente;
import it.demacs.Strategy.Pattern.Strategy;

public class App {
  public static void main(String[] args) {
    List<Integer> l = new ArrayList<Integer>();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(4);
    l.add(5);
    
    Strategy s;
    //s = new OrdinamentoCrescente();
    //s = new OrdinamenteDecrescente();
    s = new OrdinamentoCrescenteDecrescente();
    Context c = new Context(s, l);
    c.ordinamento();
  }
}
