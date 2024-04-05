<<<<<<< HEAD
package it.demacs.TemplateMethod;

public class Main {
	public static void main(String[] args)
	{
		ProcessoOrdineTemplate netOrder = new OrdineOnline();
		netOrder.processOrder(true);
		System.out.println();
		ProcessoOrdineTemplate storeOrder = new OrdineNegozio();
		storeOrder.processOrder(true);
	}
}
=======
package it.demacs.TemplateMethod;

public class Main {
	public static void main(String[] args)
	{
		ProcessoOrdineTemplate netOrder = new OrdineOnline();
		netOrder.processOrder(true);
		System.out.println();
		ProcessoOrdineTemplate storeOrder = new OrdineNegozio();
		storeOrder.processOrder(true);
	}
}
>>>>>>> 55f6c0ef7f10c3f799f15517738eb0527620974e
