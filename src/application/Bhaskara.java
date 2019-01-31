package application;

import java.util.Scanner;
import java.util.InputMismatchException;

import entities.Dados;
import exceptions.DomainException;

public class Bhaskara {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = 0, b = 0, c = 0;

		System.out.println("Informe os dados para cálculo de Bháskara...");

		try {
			do {
				System.out.print("Valor A: ");
				a = sc.nextDouble();
				if (a == 0) {
					System.out.println("O valor de A não pode ser 0. Tente novamente...");
				}
			} while (a == 0);

			System.out.print("Valor B: ");
			b = sc.nextDouble();
			System.out.print("Valor C: ");
			c = sc.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("ERRO: Inserir apenas números decimais ou inteiros");
			System.exit(0);
		}

		Dados dados = new Dados(a, b, c);

		try {
			System.out.println("==================================");
			System.out.println("==== Resultados de BHASKARA ======");
			System.out.println("==================================");
			System.out.println("Delta: " + dados.calculoDelta() + "\nX': " + String.format("%.2f", dados.calculoX1())
					+ "\nX'': " + String.format("%.2f", dados.calculoX2()));
		} catch (DomainException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
		sc.close();
	}
}