package application;

import java.util.Scanner;
import java.util.InputMismatchException;

import entities.Dados;

public class Bhaskara {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = 0, b = 0, c = 0;

		System.out.println("Informe os dados para cálculo de Bháskara...");

		try {
			System.out.print("Valor A: ");
			a = sc.nextDouble();
			System.out.print("Valor B: ");
			b = sc.nextDouble();
			System.out.print("Valor C: ");
			c = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("ERRO: Inserir apenas números decimais ou inteiros");
			System.exit(0);;
		} 
		
		Dados dados = new Dados(a, b, c);

		System.out.println("==================================");
		System.out.println("==== Resultados de BHASKARA ======");
		System.out.println("==================================");
		System.out.print(dados);

		sc.close();
	}
}