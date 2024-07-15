package DesafiosDeCodigoDioJavaIA;

import java.util.Scanner;

public class VerificacaoChequeEspecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        if(saque <= saldo){
            System.out.println("Transacao realizada com sucesso.");

            double saldoTotal = saldo + limiteChequeEspecial;
            if (saque <= saldoTotal)
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            else
               
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");

        }


        scanner.close();
	}
}
