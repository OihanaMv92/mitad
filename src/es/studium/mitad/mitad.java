package es.studium.mitad;

import java.util.Scanner;

public class mitad
{

	public static void main(String[] args)
	{


		int numero;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese un número entero para calcular su mitad ");
		numero = teclado.nextInt();

		System.out.println("La mitad del número es " + mitad(numero));
		teclado.close();
	}

	public static float mitad(int num)
	{
		float resultado;
		resultado = (float)num/2;
		return (resultado);

	}
	
}


