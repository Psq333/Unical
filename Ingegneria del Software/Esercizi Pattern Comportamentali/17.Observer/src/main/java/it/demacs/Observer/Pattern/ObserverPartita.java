package it.demacs.Observer.Pattern;

public class ObserverPartita implements Observer {
    private String id;
    private String score;
    public ObserverPartita(String id) {
        this.id = id;
    }
    @Override
    public void update(Object score) {
        System.out.println("(observer-"+id+")risultato: "+ (String) score);
        this.score = (String) score;
    }
}
