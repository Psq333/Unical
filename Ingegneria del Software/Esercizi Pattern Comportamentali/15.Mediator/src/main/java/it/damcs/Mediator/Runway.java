package it.damcs.Mediator;

class Runway implements Command
{
	private IATCMediator atcMediator;

	public Runway(IATCMediator atcMediator)
	{
		this.atcMediator = atcMediator;
		atcMediator.setAtterraggioStato(true);
	}

	@Override
	public void land()
	{
		System.out.println("Permesso di atterraggio concesso.");
		 atcMediator.setAtterraggioStato(true);
	}

}
