package exercicio01_05;

import java.util.Scanner;
import java.time.LocalDateTime;

public class exercicio3 {

	public static void main(String[] args) {
		
  		//Declara��o das vari�veis.
  		int anoNascimento; 
  		int anoAtual;
  		
	  	//Entradas de dados
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Digite o numero 1:");
  		anoNascimento = teclado.nextInt();
  		
  		//Date data = new Date();
  		//anoAtual = data.getYear();
  		//String ano = new SimpleDateFormat("yyyy").format(data);
  		//anoAtual = ano.parseInt();
  		//anoAtual = now().getYear();
  		
  		LocalDateTime data1 = LocalDateTime.now();
  		anoAtual = data1.getYear();
  		
	  	//Processamento e Sa�da
 		System.out.println("Idade:" + (anoAtual-anoNascimento));
 		anoNascimento = teclado.nextInt();
 		anoAtual = teclado.nextInt();
 		
 		teclado.close();
	}	
}
