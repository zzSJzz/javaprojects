package javaprojects.classesAtvd.atvd18e19.quest1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Quadrante quadrante = new Quadrante();

        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quadrante");

        System.out.println("Digite o valor de X: ");
        x = sc.nextInt();
        quadrante.setX(x);

        System.out.println("Digite o valor de Y: ");
        y = sc.nextInt();
        quadrante.setY(y);

        quadrante.verifica_quadrante();
    }
}
