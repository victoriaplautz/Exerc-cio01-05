package exercicio01_05;

import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		
  		//Declara��o das vari�veis.
		
		//1- o nome do funcion�rio;
		//2- o n�mero de horas trabalhadas por este funcion�rio;
		//3- e o n�mero de dependentes deste funcion�rio.		

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
  	    
	  	//Sa�da
  	    System.out.println("Nome:" + nome);
 		System.out.println("Bruto:" + salarioBruto);
 		System.out.println("INSS:" + valorINSS);
 		System.out.println("IR:" + valorIR);
 		System.out.println("Liquido:" + salarioLiquido);
 		
  		teclado.close();
	}
}
