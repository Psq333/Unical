package it.damcs.Interpreter;

class Terminal_Expression implements Expression
{
	String data;

	public Terminal_Expression(String data)
	{
		this.data = data;
	}

	public boolean interpreter(String con)
	{
		if(con.contains(data))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
