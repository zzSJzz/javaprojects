package javaprojects.classesAtvd.atvdFuncionario;

public class App {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Luis ");
        funcionario.setSobrenome("Silva");
        funcionario.setHorasTrabalhadas(10);
        funcionario.setValorPorHora(25.50);

        System.out.println("Funcionários \n");
        funcionario.nomeCompleto();
        funcionario.incrementarHoras();
        funcionario.calcularSalario();

    }
}
