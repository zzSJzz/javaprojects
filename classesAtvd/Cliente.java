package javaprojects.classesAtvd;

public class Cliente {



    private String nome;
    private int idade;

    public Cliente(String novoNome, int novaIdade){
        nome = novoNome;
        idade = novaIdade;
    }

    public static void main(String[] args) {

        Cliente cliente = new Cliente("João", 25);
        System.out.println("O nome é: " + cliente.nome + "\n" +
                "A idade é: " + cliente.idade);
    }
}
