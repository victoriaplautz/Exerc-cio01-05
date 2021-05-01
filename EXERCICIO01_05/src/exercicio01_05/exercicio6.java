package exercicio01_05;

import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		
  		//Declaração das variáveis.
		
		//1- o nome do funcionário;
		//2- o número de horas trabalhadas por este funcionário;
		//3- e o número de dependentes deste funcionário.		

		final double Valor_Hora = 32.00;
		
  		String nome; 
  		int numeroHoras;
  		int dependentes;
  		
	  	//Entradas de dados
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Nome:");
  		nome = teclado.next();

  		System.out.println("Horas:");
  		numeroHoras = teclado.nextInt();
  		
  		System.out.println("Dependentes:");
  		dependentes = teclado.nextInt();  

  	    double salarioBruto   = numeroHoras * 32 + dependentes * 40;
  	    double valorINSS      = salarioBruto * 8.5 / 100;
  	    double valorIR        = salarioBruto * 5 / 100;
  	    double salarioLiquido = salarioBruto - valorINSS - valorIR;  	
  	    
	  	//Saída
  	    System.out.println("Nome:" + nome);
 		System.out.println("Bruto:" + salarioBruto);
 		System.out.println("INSS:" + valorINSS);
 		System.out.println("IR:" + valorIR);
 		System.out.println("Liquido:" + salarioLiquido);
 		
  		teclado.close();
	}
}
