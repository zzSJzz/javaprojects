package javaprojects.classesAtvd.atvd18e19.quest3;

public class Caneta {

    //Parametros

    private final String marca;
    private final String cor;
    private final String tamanho;


    public Caneta(String marca, String cor, String tamanho){
        this.cor = cor;
        this.marca = marca;
        this.tamanho = tamanho;
    }

    void imprimirDados(){
        System.out.printf("Caneta \n" +
                "Cor: %s \n" +
                "Marca: %s \n" +
                "Tamanho: %s",
                cor, marca, tamanho);
    }
}
