package vetor;

import java.util.Scanner;

public class ExemploVetor2 {

	public static void main(String[] args) {

		int vetorNumeros[] = new int[3]; // Forma de declarar vetor [3] significa quantidade de casas do vetor

		Scanner leia = new Scanner(System.in);

		// vetorNumero[0]

		for (int indice = 0; indice < 3; indice++) { // Popular / adicionar inens ao vetor
			System.out.println("Digite um número: ");
			vetorNumeros[indice] = leia.nextInt();
		}

		for (int indice = 0; indice < 3; indice++) { // Mostrar itens do vetor
			System.out.println("\n" + (indice + 1) + "º elemento: " + vetorNumeros[indice]);
		}

		System.out.println("\nTamanho do Vetor: " + vetorNumeros.length);

	}

}
