package javaprojects.atividadesDeClasse.hackerRank;

import java.util.Scanner;

public class challenger02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int myInt1 = input.nextInt();
        System.out.println("Digite um número: ");
        int myInt2 = input.nextInt();
        System.out.println("Digite um número: ");
        int myInt3 = input.nextInt();

        System.out.println(myInt1 + "\n " +
                        myInt2 + "\n" + myInt3);
        input.close();
    }
}
