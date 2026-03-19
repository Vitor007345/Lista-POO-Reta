package main;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("========Calculadora de Distancia entre pontos===========");
		System.out.print("\nDigite o primeiro ponto: ");
		Ponto2D p1 = new Ponto2D(sc.nextDouble(), sc.nextDouble());
		System.out.print("\nDigite o segundo ponto: ");
		Ponto2D p2 = new Ponto2D(sc.nextDouble(), sc.nextDouble());
		
		System.out.println("\nA distancia entre os pontos é " + p1.calcularDistanciaPontos(p2));
	}

}
