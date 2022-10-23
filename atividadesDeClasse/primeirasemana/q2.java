package javaprojects.atividadesDeClasse.primeiraSemana;

import java.util.Scanner;

public class q2 {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        int b, h;

        System.out.println("Digite o valor da base da casa: ");
        b = input.nextInt();

        System.out.println("Digite o valor da altura da casa: ");
        h = input.nextInt();

        double A = b * h, potencia = A * 18;
        if (potencia >= 1000) {
            potencia = (potencia / 1000);
            System.out.println("Um cômodo com área de " + A + "m2 irá ser necessário uma potência de " + potencia + "KW.");
        }
        else {
            System.out.println("Um cômodo com área de " + A + "m2 irá ser necessário uma potência de " + potencia + "Watts.");
        }
        input.close();
    }
}
