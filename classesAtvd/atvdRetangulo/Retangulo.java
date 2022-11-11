package javaprojects.classesAtvd.atvdRetangulo;

public class Retangulo {

    private float lado1, lado2;




    void calcularArea(){
        float area = lado1 * lado2;
        System.out.printf("Area: %.2f\n", area);
    }

    void calcularPerimetro(){
        float perimetro = 2*lado1 + 2*lado2;
        System.out.printf("Perímetro: %.2f\n", perimetro);
    }

    void separador(){
        System.out.println("==================");
    }

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
}
