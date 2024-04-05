package it.demacs.Observer.Pattern;

import java.util.ArrayList;
import java.util.List;

public class ObservablePartita {
	private String matchScore;
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer channel) {
        channel.update(this.matchScore);
        this.observers.add(channel);
    }
    public void removeObserver(Observer channel) {
        this.observers.remove(channel);
    }
    public ObservablePartita() {
        this.matchScore = "0-0";
    }
    public void setMatchScore(String newScore) {
        this.matchScore = newScore;
        for (Observer observer : this.observers) {
            observer.update(this.matchScore);
        }
    }
}
