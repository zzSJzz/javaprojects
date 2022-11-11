package javaprojects.classesAtvd.atvdRetangulo;

public class App {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLado1(10);
        retangulo.setLado2(5);

        System.out.println("Retângulo\n" +
                "Lado1: " + retangulo.getLado1() +
                "\nLado2: " + retangulo.getLado2());
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        retangulo.separador();
        retangulo.setLado2(7);
        System.out.println("Retângulo\n" +
                "Lado1: " + retangulo.getLado1() +
                "\nLado2: " + retangulo.getLado2());
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        retangulo.separador();
    }
}
