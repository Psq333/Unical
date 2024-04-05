package it.damcs.Interpreter;

public class App 
{
	public static void main(String[] args)
	{
		Expression person1 = new Terminal_Expression("Franco");
		Expression person2 = new Terminal_Expression("Antonia");
		Expression isSingle = new OrExpression(person1, person2);
		
		Expression vikram = new Terminal_Expression("Giovanni");
		Expression committed = new Terminal_Expression("Giuseppina");
		Expression isCommitted = new AndExpression(vikram, committed);	

		System.out.println(isSingle.interpreter("Franco"));
		System.out.println(isSingle.interpreter("Antonia"));
		System.out.println(isSingle.interpreter("Piero"));
		
		System.out.println(isCommitted.interpreter("Giovanni, Giuseppina"));
		System.out.println(isCommitted.interpreter("Franco, Giuseppina"));

	}
}
