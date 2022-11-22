package javaprojects.classesAtvd.atvd18e19.quest5;

public class Apolice {
    private String nome;
    private int idade;
    private float valor;

    void imprimir(){
        System.out.printf("""
                        Nome do segurado: %s
                        Idade do segurado: %d
                        Valor do prêmio da apolice: %.2f""",
                getNome(), getIdade(), getValor());
    }

    void calcularPremioApolice(){
        if (idade >= 18 & idade <= 25){
            valor += (valor * 20) / 100;
        }

        if (idade >= 25 & idade <= 26){
            valor += (valor * 15) / 100;
        }

        if (idade >= 36){
            valor += (valor * 10) / 100;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    void espaco(){
        System.out.println("=====================\n\n=====================");
    }
}
