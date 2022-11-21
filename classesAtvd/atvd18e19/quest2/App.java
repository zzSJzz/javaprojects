package javaprojects.classesAtvd.atvd18e19.quest2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Data data = new Data();
        Scanner sc = new Scanner(System.in);

        System.out.print("Data \n" +
                "Digite o dia: ");
        int d = sc.nextInt();

        System.out.println("Digite o mês: ");
        int m = sc.nextInt();

        System.out.println("Digite o ano: ");
        int y = sc.nextInt();

        data.setDia(d);
        data.setMes(m);
        data.setAno(y);

        data.validarData();

        System.out.println(data);

    }

}
