package metodos;

import metodoExterno.ExemploMetodoExterno;

public class ExemploMetodos {

	public static void main(String[] args) {

		int resultado = somar(2, 5); // Resultado = 7

		System.out.println("O primeiro resultado: " + resultado);
		// System.out.println("O segundo resultado: " + somar(3,3));

		mensagem();
		saudacao("Bom dia, turma");
		
		ExemploMetodoExterno.info();

	}

	public static int somar(int num1, int num2) { // Assinatura do Método
		return num1 + num2; // Procedimento - Lógica do Método
	}

	public static void mensagem() {
		// void = auseêcia de retorno
		System.out.println("Esse método não tem retorno (void)");
	}

	public static void saudacao(String msg) {
		System.out.println(msg);
	}
}
