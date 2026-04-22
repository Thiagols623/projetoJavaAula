package lacoCondicional;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		// Variaveis
		float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a pimeira nota: ");
		nota1 = leia.nextFloat();
		//  Entrada de dados
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		// Processamento
		media = (nota1 + nota2) / 2;
		
		if(media >= 6) {
			System.out.println("Parabéns, pessoa participante aprovada! ");
		}else {
			System.out.println("Infelizmente pessoa participante foi reprovada. ");
		}
		

	}

}
