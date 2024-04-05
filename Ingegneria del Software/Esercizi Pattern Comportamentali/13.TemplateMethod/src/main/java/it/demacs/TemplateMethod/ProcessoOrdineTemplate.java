<<<<<<< HEAD
package it.demacs.TemplateMethod;

abstract class ProcessoOrdineTemplate
{
	public boolean isGift;

	public abstract void doSelect();

	public abstract void doPayment();

	public final void giftWrap()
	{
		try
		{
			System.out.println("Regalo impacchettato correttamente");
		}
		catch (Exception e)
		{
			System.out.println("Regalo non impacchettato correttamente");
		}
	}

	public abstract void doDelivery();

	public final void processOrder(boolean isGift)
	{
		doSelect();
		doPayment();
		if (isGift) {
			giftWrap();
		}
		doDelivery();
	}
}

=======
package it.demacs.TemplateMethod;

abstract class ProcessoOrdineTemplate
{
	public boolean isGift;

	public abstract void doSelect();

	public abstract void doPayment();

	public final void giftWrap()
	{
		try
		{
			System.out.println("Regalo impacchettato correttamente");
		}
		catch (Exception e)
		{
			System.out.println("Regalo non impacchettato correttamente");
		}
	}

	public abstract void doDelivery();

	public final void processOrder(boolean isGift)
	{
		doSelect();
		doPayment();
		if (isGift) {
			giftWrap();
		}
		doDelivery();
	}
}

>>>>>>> 55f6c0ef7f10c3f799f15517738eb0527620974e
