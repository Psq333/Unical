package it.damcs.Mediator;

interface IATCMediator
{
	public void registrazionePista(Runway runway);
	public void registrazioneVolo(Flight flight);
	public boolean atterrato();
	public void setAtterraggioStato(boolean status);
}





