package it.damcs.Mediator;

class Flight implements Command
{
	private IATCMediator atcMediator;

	public Flight(IATCMediator atcMediator)
	{
		this.atcMediator = atcMediator;
	}

	@Override
	public void land()
	{
		if (atcMediator.atterrato())
		{
			System.out.println("Atterraggio con successo.");
			atcMediator.setAtterraggioStato(true);
		}
		else
			System.out.println("Attentere per l'atterraggio.");
	}

	public void getReady()
	{
		System.out.println("Pronto per l'atterraggio.");
	}

}
