package javaprojects.classesAtvd.atvdFuncionario;

public class Funcionario{

    private String nome, sobrenome;
    public int valor;
    private int horasTrabalhadas;
    private double valorPorHora;

    void nomeCompleto(){
        String nomeCompleto = nome + sobrenome;
        System.out.printf("Nome Completo: %s\n", nomeCompleto);
    }

    void calcularSalario(){
        double calcularSalario = horasTrabalhadas * valorPorHora;
                System.out.printf("Salário: R$ %.2f\n", calcularSalario);
    }

     void incrementarHoras(){
        valorPorHora = valorPorHora + valor;
        valor = 8;
        System.out.printf("Valor p/h: R$ %.2f\n", valorPorHora);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }


    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
