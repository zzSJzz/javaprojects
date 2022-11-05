package javaprojects.classesAtvd;

import java.util.Scanner;

public class ContaCorrente {
    float saldo;
    private String numero;

    public String getNumero(){
        return numero;
    }
    public String setNumero(String novoNumero){
        numero = novoNumero;
        return numero;
    }
    void definirSaldoInicial(float saldoInicial){
        saldo = saldoInicial;
    }

    void depositar(float valor){
        saldo = saldo + valor;
    }

    boolean sacar(float valor) {
        if (saldo >= valor){
            saldo = saldo - valor;
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ContaCorrente conta = new ContaCorrente();
        conta.definirSaldoInicial(500);

        System.out.println("O saldo inicial da conta é " + conta.saldo);

        System.out.println("Qual valor você deseja sacar:");
        Float valor = entrada.nextFloat();
        conta.sacar(valor);
        System.out.println("Valor depositado com succeso! \n" +
                "Valor atual: " + conta.saldo);

        System.out.println("Qual valor você deseja depositar: ");
        valor = entrada.nextFloat();
        conta.depositar(valor);
        System.out.println("Valor depositado com succeso! \n" +
                "Valor atual: " + conta.saldo);

        System.out.println("O saldo atual é " + conta.saldo);

        boolean saque = conta.sacar(500);
        if (saque == true){
            System.out.println("O saque foi relizado com sucesso");
            System.out.println("Valor estante: " + conta.saldo);
        }
    }

}
