package ControleDeFluxo;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
		Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite seu nome");
		String nome = Scanner.next();
		
		System.out.println("Digite seu sobrenome");
		String sobrenome = Scanner.next();
		
		System.out.println("digite sua idade");
		int idade = Scanner.nextInt();
	
		System.out.println("Digite sua altura");
		double altura = Scanner.nextDouble();
		
		//imprindo os dados obtidos pelo usuario
		System.out.println("Ola, me chamo" + nome.toUpperCase() + " " + sobrenome);
		System.out.println("Tenho" + idade + "anos");
		System.out.println("minbha altura é " + altura + "cm");
		Scanner.close();
	}
	
        catch ( java.util.InputMismatchException e){
        	System.out.println("O campo idade e altura precisam ser numercos");
	
	
	}

	}
}
