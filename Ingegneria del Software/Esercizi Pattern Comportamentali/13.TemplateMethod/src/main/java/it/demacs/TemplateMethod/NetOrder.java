<<<<<<< HEAD
package it.demacs.TemplateMethod;

class OrdineOnline extends ProcessoOrdineTemplate
{
	@Override
	public void doSelect()
	{
		System.out.println("L'oggetto viene aggiunto al carrello");
		System.out.println("Inserisce preferenze per la confezione regalo");
		System.out.println("Inserisce indirizzo consegna.");
	}

	@Override
	public void doPayment()
	{
		System.out.println
				("Pagamento con carta");
	}

	@Override
	public void doDelivery()
	{
		System.out.println
					("L'articolo viene spedito tramite posta");
	}

=======
package it.demacs.TemplateMethod;

class OrdineOnline extends ProcessoOrdineTemplate
{
	@Override
	public void doSelect()
	{
		System.out.println("L'oggetto viene aggiunto al carrello");
		System.out.println("Inserisce preferenze per la confezione regalo");
		System.out.println("Inserisce indirizzo consegna.");
	}

	@Override
	public void doPayment()
	{
		System.out.println
				("Pagamento con carta");
	}

	@Override
	public void doDelivery()
	{
		System.out.println
					("L'articolo viene spedito tramite posta");
	}

>>>>>>> 55f6c0ef7f10c3f799f15517738eb0527620974e
}