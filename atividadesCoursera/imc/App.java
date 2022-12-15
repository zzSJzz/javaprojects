package javaprojects.atividadesCoursera.imc;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("IMC \nDigite o peso(kg): ");
        double peso = sc.nextDouble();
        System.out.println("Digite a altura(metros): ");
        double altura = sc.nextDouble();

        IMC imc = new IMC(peso, altura);
        imc.calcularIMC();
        imc.diagnostico();
    }


}
