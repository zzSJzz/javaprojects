package javaprojects.classesAtvd.atvdCarros;

import java.util.Scanner;

public class Automovel {

    //Variaveis
    int velocidade;

    private String marca, cor;

    public String getMarca(){ return marca;}
    public String getCor(){ return cor;}

    public String setMarca(String novaMarca){
        marca = novaMarca;
        return marca;
    }

    public String setCor(String novaCor){
        cor = novaCor;
        return cor;
    }

    void definirVelocidadeInicial(int velocidadeInicial) {velocidade = velocidadeInicial; }

    void acelerar(int valor){velocidade = velocidade + valor;}

    boolean reduzir(int valor){
        if (velocidade >= valor) {
            velocidade = velocidade - valor;
            return true;
        }
        else{
            return false;
        }
    }

    //comandos

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Automovel automovel = new Automovel();
        automovel.definirVelocidadeInicial(automovel.velocidade);

        System.out.println("Digite a marca do carro: " );
        String novaMarca = sc.nextLine();
        automovel.setMarca(novaMarca);

        System.out.println("Digite a cor do carro: " );
        String novaCor = sc.nextLine();
        automovel.setCor(novaCor);

        System.out.println("Marca do carro: " + automovel.getMarca() +
                "\nCor do carro: " + automovel.getCor() +
                "\nO carro está parado: " + automovel.velocidade + "km/h");

        System.out.println("Quantos km/h deseja aumentar: ");
        int valor = sc.nextInt();
        automovel.acelerar(valor);
        System.out.println("O carro foi acelerado com sucesso!\n" +
                "Velocidade atual: " + automovel.velocidade + "km/h");

        System.out.println("Quantos km/h deseja reduzir: ");
        valor = sc.nextInt();
        boolean reduz = automovel.reduzir(valor);
        if (reduz) {
            System.out.println("A velocidade do carro foi reduzida com sucesso!\n" +
                    "Velocidade atual: " + automovel.velocidade + "km/h");
        }
        else {
            System.out.println("A velocidade do carro não foi reduzida!\n" +
                    "Velocidade atual: " + automovel.velocidade + "km/h");
        }




    }

}
