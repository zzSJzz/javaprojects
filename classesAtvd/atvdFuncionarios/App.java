package javaprojects.classesAtvd.atvdFuncionarios;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String nome, cpf;
        double valor;

        Gerente gerente = new Gerente();
        Scanner sc = new Scanner(System.in);

        int cont = 1;

        System.out.println("Digite a senha principal: ");
        int senhaPrincipal = sc.nextInt();
        gerente.setSenha(senhaPrincipal);
        System.out.println("A senha foi alterada para: " + gerente.getSenha());

        int a = 1;
        do{
            System.out.println("Acesso GERENTE \n" +
                    "Senha: ");
            int pw = sc.nextInt();
            if (gerente.getSenha() == pw){
                break;
            }else{
                a++;
            }
        }while(true);
        System.out.println("Você acessou após a " + a + " tentativa.");
        System.out.println("PESSOA " + cont +
                "\nDigite nome: ");
        nome = sc.next();
        sc.nextLine();
        System.out.println("CPF: ");
        cpf = sc.next();
        System.out.println("Salário: ");
        sc.nextLine();
        valor = sc.nextFloat();

        Funcionarios funcionarios = new Funcionarios(nome, cpf, valor);
        funcionarios.imprimirDados();
    }
}


