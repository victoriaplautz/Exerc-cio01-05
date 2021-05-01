package exercicio01_05;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		//Declaração das variáveis.
  		double valor; 
  		double valorNovo;
  		
	  	//Entradas de dados
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Digite o valor:");
  		valor = teclado.nextDouble();
  		
  		valorNovo = (valor + (valor * (15.8/100)));
  		
	  	//Processamento e Saída
 		System.out.println("Valor novo:" + valorNovo);
 		
 		teclado.close();
	}	
}
