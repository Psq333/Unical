package it.damcs.Mediator;

public class App {
	public static void main(String[] args) {
		IATCMediator atcMediator = new ATCMediator();
		Flight sparrow101 = new Flight(atcMediator);
		Runway pistaPrincipale = new Runway(atcMediator);
		atcMediator.registrazioneVolo(sparrow101);
		atcMediator.registrazionePista(pistaPrincipale);
		sparrow101.getReady();
		pistaPrincipale.land();
		sparrow101.land();
  }
}
