package DesafiosDeCodigoDioJavaIA;

import java.util.Scanner;

public class VerificadorNumeroConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
	    
	        try {
	    
	            String numero = scanner.next();

	            verificarNumeroConta(numero);
	            System.out.println("Numero de conta valido.");

	    
	        } catch (IllegalArgumentException e) {
	    
	            System.out.println("Erro: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }

	    
	    private static void verificarNumeroConta(String numeroConta) {

	   
	        int contadorDeNumero = numeroConta.length();
	        int numeroDigitado = 0;
	        for (int i = 0; i < contadorDeNumero; i++) {
	            numeroDigitado++;
	        }
	   
	        if (numeroDigitado != 8) {
	            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
	        }

	    }


}
