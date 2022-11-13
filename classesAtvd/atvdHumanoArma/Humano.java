package javaprojects.classesAtvd.atvdHumanoArma;

public class Humano {

    void puxarArma(){
        System.out.println("Arma puxada com sucesso!");
    }

    void apertaGatilho(){
        System.out.println("Informação enviada para arma com sucesso!");
    }

    Humano(){
        puxarArma();
        apertaGatilho();
    }
}
