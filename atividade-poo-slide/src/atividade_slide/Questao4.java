package atividade_slide;

import java.util.Scanner;

public class Questao4 {
	public static void impaPar(Scanner scanner) {
		
		System.out.println("Escolha um numero: ");
		int numero = scanner.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " � par!");
		}else {
			System.out.println(numero + " � impar!");
		}
		
	}
}
