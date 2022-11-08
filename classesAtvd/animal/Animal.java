package javaprojects.classesAtvd.animal;

public class Animal {
    private final String nome, cor, ambiente;
    private final float comprimento, velocidadeMedia;
    private final int numeroPatas;


    public Animal(String nome, String cor, String ambiente, float comprimento,
                  float velocidadeMedia, int numeroPatas){
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velocidadeMedia = velocidadeMedia;
        this.numeroPatas = numeroPatas;

    }

    void impimirDados(){
        System.out.printf("""
                        NOME: %s
                        Cor : %s
                        Ambiente: %s
                        Comprimento: %.2f cm     VelocidadeMedia: %.2f km/h
                        Número de patas: %d patas""",
                nome, cor, ambiente, comprimento,
                velocidadeMedia, numeroPatas
        );
    }

}
