package Application;
import java.util.Scanner;

import entities.program;

import java.util.Locale;

public class Dolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o preço do dolar?");
		double precoDolar = sc.nextDouble();
		System.out.println("Quantos dolares eu vou comprar?");
		double amount = sc.nextDouble();
		double result = program.dolarParaReal(amount, precoDolar);
		System.out.printf("Quantia para ser paga em reais = %.2f%n ", result);
		
		sc.close();
	}

}
