package it.damcs.Mediator;

class ATCMediator implements IATCMediator
{
	private Flight flight;
	private Runway runway;
	public boolean land;

	public void registrazionePista(Runway runway)
	{
		this.runway = runway;
	}

	public void registrazioneVolo(Flight flight)
	{
		this.flight = flight;
	}

	public boolean atterrato()
	{
		return land;
	}

	@Override
	public void setAtterraggioStato(boolean status)
	{
		land = status;
	}
}
