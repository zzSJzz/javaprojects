package javaprojects.atividadesCoursera.pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza pizza = new Pizza();

        System.out.println("Digite o número total de ingredientes da 1° pizza: ");
        int tot = sc.nextInt();
        pizza.setTotIngredientes(tot);
        List<String> arrayList1 = new ArrayList<String>();
        List<String> arrayList2 = new ArrayList<String>();
        List<String> arrayList3 = new ArrayList<String>();
        for (int x = 0; x < pizza.getTotIngredientes(); x++){
            System.out.println("Digite o nome do ingrediente: ");
            String ing = sc.nextLine();
            sc.next();
            arrayList1.add(ing);
        }

        System.out.println("Digite o número total de ingredientes da 2° pizza: ");
        for (int x = 0; x < pizza.getTotIngredientes(); x++){
            System.out.println("Digite o nome do ingrediente: ");
            String ing = sc.nextLine();
            sc.next();
            arrayList2.add(ing);
        }

        System.out.println("Digite o número total de ingredientes da 3° pizza: ");
        for (int x = 0; x < pizza.getTotIngredientes(); x++){
            System.out.println("Digite o nome do ingrediente: ");
            String ing = sc.nextLine();
            sc.next();
            arrayList3.add(ing);
        }

        System.out.println("LISTA " +
                "\nPizza 1: " + arrayList1 +
                "\nPizza 2: " + arrayList2 +
                "\nPizza 3: " + arrayList3);



    }

}
