package javaprojects.classesAtvd.atvd18e19.quest1;

public class Quadrante {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    void verifica_quadrante(){
        if (x >= 0 & y >= 0){
            System.out.println("Quadrante 1");
        }

        else if (x >= 0 & y < 0){
            System.out.println("Quadrante 4");
        }

        else if (y < 0){
            System.out.println("Quadrante 3");
        }

        else {
            System.out.println("Quadrante 2");
        }
    }

}