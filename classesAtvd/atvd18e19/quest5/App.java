package javaprojects.classesAtvd.atvd18e19.quest5;

import java.util.Scanner;

public class App {
    static Apolice apolice = new Apolice();
    static Scanner sc = new Scanner(System.in);

    float valor;

    void oferecerDesconto() {
        System.out.println("""
                Selecione uma cidade:\s
                1 - Curitiba
                2 - Rio de Janeiro
                3 - São Paulo
                4 - Belo Horizonte""");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1 -> {
                valor = apolice.getValor() / 100 * 20;
                valor = apolice.getValor() - valor;
                apolice.setValor(valor);
            }
            case 2 -> {
                valor = apolice.getValor() / 100 * 15;
                valor = apolice.getValor() - valor;
                apolice.setValor(valor);
            }
            case 3 -> {
                valor = apolice.getValor() / 100 * 10;
                valor = apolice.getValor() - valor;
                apolice.setValor(valor);
            }
            case 4 -> {
                valor = apolice.getValor() / 100 * 5;
                valor = apolice.getValor() - valor;
                apolice.setValor(valor);
            }
            default -> {
                System.out.println("Número incorreto, o programa será encerrado.");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println("Apolice" +
                "\nDigite o nome do segurado: ");
        String nome = sc.nextLine();
        apolice.setNome(nome);

        System.out.println("Digite a idade do segurado: ");
        int idade = sc.nextInt();
        apolice.setIdade(idade);

        System.out.println("Digite o valor do prêmio da apolice: ");
        float valor = sc.nextFloat();
        apolice.setValor(valor);

        apolice.calcularPremioApolice();
        app.oferecerDesconto();
        apolice.espaco();
        apolice.imprimir();


    }
}
