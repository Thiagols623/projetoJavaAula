package lacoCondicional;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {
		
		// Variaveis
		float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Digite a pimeira nota: ");
		nota1 = leia.nextFloat();
	
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();

		// Processamento
		media = (nota1 + nota2) / 2;

		if (media >= 6) {
			System.out.println("Parabéns, pessoa participante aprovada! ");
		} else if (media >= 5) {
			System.out.println("Pessoa participante de exame. ");
		}

		else {
			System.out.println("Infelizmente pessoa participante foi reprovada. ");
		}

	}

}