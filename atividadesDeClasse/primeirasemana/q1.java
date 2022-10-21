package javaprojects.atividadesDeClasse.primeirasemana;

import java.util.Scanner;

public class q1 {
    public static void main(String [] args) {
        Scanner x = new Scanner(System.in);
        int salario, comissao;
        
        System.out.print("Digite seu salário: ");
        salario = x.nextInt();

        System.out.print("\nDigite sua comissão: ");
        comissao = x.nextInt();

        double salFinal = salario + (comissao/4);
        System.out.print("\nSeu salário final é: R$ " + salFinal);
        
        x.close();
        
    }
}