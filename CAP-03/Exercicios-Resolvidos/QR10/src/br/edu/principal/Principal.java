package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double area = 0;
		double raio = 0;
		
		System.out.println("Digite o raio do círculo: ");
		raio = sc.nextDouble();
		
		area = 3.1415 * raio * raio;
		
		System.out.println("A área do círculo é: " + new DecimalFormat(".##").format(area));
	
	
	
	
	}

}
