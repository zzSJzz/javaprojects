package javaprojects.classesAtvd.lista4.q3;

public class App {
    public static void main(String[] args) {
        Cavalo cavalo = new Cavalo();
        Cachorro cachorro = new Cachorro();
        Preguica preguica = new Preguica();

        System.out.println("Cavalo ");
        cavalo.som();
        cavalo.correr();

        System.out.println("Cachorro ");
        cachorro.som();
        cachorro.correr();

        System.out.println("Preguiça ");
        preguica.som();
        preguica.subir();
    }
}
