package ejercicio10y11;


public class PruebaThreads
{
	public static void main(String args[])
	{
		CuentaAtras contador1 = new CuentaAtras("ID1", 4);
		CuentaAtras contador2 = new CuentaAtras("ID2", 7);
		CuentaAtras contador3 = new CuentaAtras("ID3", 8);
		
		contador1.run();
		contador2.run();
		contador3.run();
	}
}
