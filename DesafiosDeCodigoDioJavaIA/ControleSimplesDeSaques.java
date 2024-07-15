package DesafiosDeCodigoDioJavaIA;

import java.util.Scanner;


public class ControleSimplesDeSaques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner Scanner = new Scanner(System.in);

		        double limiteDiario = Scanner.nextDouble();
		        double saque  = 0;
		       
		        for (double valorSaque  = saque; limiteDiario >valorSaque ;limiteDiario-=valorSaque){
		            
		            saque = Scanner.nextDouble();

		           
		            if (saque == 0) {
		                System.out.println("Transacoes encerradas.");
		                return;
		            }else {

		                if (saque <= limiteDiario) {
		                    limiteDiario -= saque;
		                    System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiario));
		                } else {

		                    
		                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
		                    return;
		                }
		            }
		        }

		     
		        Scanner.close();
		    }
		}