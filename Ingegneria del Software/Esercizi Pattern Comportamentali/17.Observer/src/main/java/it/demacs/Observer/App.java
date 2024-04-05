package it.demacs.Observer;

import it.demacs.Observer.Pattern.ObservablePartita;
import it.demacs.Observer.Pattern.Observer;
import it.demacs.Observer.Pattern.ObserverPartita;

public class App {
	public static void main(String[] args) {
	    ObservablePartita match = new ObservablePartita();
	    Observer observer1 = new ObserverPartita("0");
	    Observer observer2 = new ObserverPartita("1");
	    match.addObserver(observer1);
	    match.addObserver(observer2);
	    match.setMatchScore("1-0");
	    match.removeObserver(observer2);
	    match.setMatchScore("2-0");
	}
}
