package javaprojects.atividadesDeClasse.primeirasemana;

import java.util.Scanner;

public class q3 {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        int salario, contas;

        System.out.println("Digite seu salário: ");
        salario = input.nextInt();

        System.out.println("Digite o número de contas: ");
        contas = input.nextInt();

        for (int i = 1; i <= contas; i++ ) {
            System.out.print("\nDigite a " + i + "° conta: ");
            contas = input.nextInt();
            salario = salario - contas;
            System.out.println("Você ficou com R$ " + salario + " reais.");
        }
        
        input.close();
    }
}
