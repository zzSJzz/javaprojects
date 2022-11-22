package javaprojects.classesAtvd.atvd18e19.quest4;

public class Lampada {

    private String tensao, cor, marca, preco, potencia;

    private boolean status;


    public String getTensao() {
        return tensao;
    }

    public void setTensao(String voltagem) {
        this.tensao = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "voltagem='" + getTensao() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", preco='" + getPreco() + '\'' +
                ", potencia='" + getPotencia() + '\'' +
                ", status=" + isStatus() +
                "}\n";
    }

    void ascender(){
        setStatus(true);
        System.out.println("Lâmpada acesa.");
        System.out.println("Status: " + isStatus() + "\n");
    }

    void apagar(){
        setStatus(false);
        System.out.println("Lampada apagada.");
        System.out.println("Status: " + isStatus());
    }
}
