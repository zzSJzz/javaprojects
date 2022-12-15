package javaprojects.atividadesCoursera.imc;

public class IMC {
    public double peso, altura, valimc;

    public double getValimc() {
        return valimc;
    }

    public void setValimc(double valimc) {
        this.valimc = valimc;
    }

    public IMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    void calcularIMC(){
        setValimc(peso /(altura * altura));
    }

    void diagnostico(){
        if (getValimc() < 16){
            System.out.println("Baixo peso muito grave");
        } else if ((getValimc() >= 16) && (getValimc() <= 16.99)) {
            System.out.println("Baixo peso grave ");
        } else if ((getValimc() >= 17) && (getValimc() <= 18.49)) {
            System.out.println("Baixo peso");
        } else if ((getValimc() >= 18.50) && (getValimc() <= 24.99)) {
            System.out.println("Peso normal");
        } else if ((getValimc() >= 25) && (getValimc() <= 29.99)) {
            System.out.println("Sobrepeso");
        } else if ((getValimc() >= 30) && (getValimc() <= 34.99)) {
            System.out.println("Obesidade grau I");
        } else if ((getValimc() >= 35) && (getValimc() <= 39.99)) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III");
        }

    }


}
