package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {

	public static void main(String[] args) {
		
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");

		// Stream
		List<String> estadosEmMaiusculo = estados.stream()  // Criação da Stram
				.map(x -> x.toUpperCase())  //Operação intermediaria (Processamento)
				.collect(Collectors.toList());  //Operação terminal (Finalização)
		
		List<String> estadosUnicos = estados.stream() // Criação da Stram
				.distinct()     //Operação intermediaria (Processamento)
				.collect(Collectors.toList());  //Operação terminal (Finalização)
		
		long quantidadeDeEstados = estados.stream()
				.distinct() //Operação intermediaria (Processamento)
				.count();  //Operação terminal (Finalização)
				
		
		System.out.println("Estados em Maiúsculo: " + estadosEmMaiusculo);
		System.out.println("\nestados Únicos: " + estadosUnicos);
		System.out.println("\nQuantidade de Estados Únicos: " + quantidadeDeEstados);
		
		System.out.println("\nColeção/Dados Inicial: " + estados);
		
	}

}
