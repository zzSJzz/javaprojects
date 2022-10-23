package javaprojects.atividadesDeClasse.terceiraSemana;

import java.util.Scanner;

public class altura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura, maiorAltura = 0, menorAltura = 1000, contHomem = 0;
        String sexo;
        Integer contMulher = 0, i, cont;

        System.out.println("Digite a quantidade de pessoas: ");
        cont = input.nextInt();
        for (i = 1; i <= cont; i++) {
        
            System.out.println("Digite sua altura: ");
            altura = input.nextDouble();
            while (altura >= 2.5) {
                System.out.println("Digite sua altura: ");
                altura = input.nextDouble();
            }
            if (altura >= maiorAltura) {
                altura = maiorAltura;
            }

            else if (altura < menorAltura) {
                altura = menorAltura;
            }

            System.out.println("Digite seu sexo (F ou M): ");
            sexo = input.nextLine();
            if (sexo == "M") {
                contHomem = (contHomem + altura) / i;
            }

            else if (sexo == "F") {
                contMulher++;
            }

            else {
                System.out.println("Digite seu sexo (M ou F): ");
                sexo = input.nextLine();
            }
        
        }
        
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura dos homens: " + contHomem);
        System.out.println("Número de mulheres" + contMulher);
        input.close();
    }
}