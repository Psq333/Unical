<<<<<<< HEAD
package it.demacs.TemplateMethod;

class OrdineNegozio extends ProcessoOrdineTemplate
{

	@Override
	public void doSelect()
	{
		System.out.println("Cliente sceglie il regalo nello store.");
	}

	@Override
	public void doPayment()
	{
		System.out.println("Cliente paga la somma totale");
	}

	@Override
	public void doDelivery()
	{
		System.out.println("Consegna dell'articolo.");
	}

=======
package it.demacs.TemplateMethod;

class OrdineNegozio extends ProcessoOrdineTemplate
{

	@Override
	public void doSelect()
	{
		System.out.println("Cliente sceglie il regalo nello store.");
	}

	@Override
	public void doPayment()
	{
		System.out.println("Cliente paga la somma totale");
	}

	@Override
	public void doDelivery()
	{
		System.out.println("Consegna dell'articolo.");
	}

>>>>>>> 55f6c0ef7f10c3f799f15517738eb0527620974e
}