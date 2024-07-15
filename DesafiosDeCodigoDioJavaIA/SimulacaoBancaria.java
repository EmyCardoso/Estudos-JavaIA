package DesafiosDeCodigoDioJavaIA;

import java.util.Scanner;

public class SimulacaoBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        
        while (true) {

            int opcao = scanner.nextInt();
            
            switch(opcao){
                case 1:
                    double saldoAtual = scanner.nextDouble();
                    saldo+=saldoAtual;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valorSacado = scanner.nextDouble();
                    if(valorSacado >saldo){
                        System.out.println("Saldo insuficiente.");
                    }else{
                        saldo-=valorSacado;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.\n");
                    return;
               
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            
                    scanner.close();
            
        }
   
	}

	}}
