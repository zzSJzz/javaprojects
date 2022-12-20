package javaprojects.atividadesCoursera.pizza;

public class Pizza {

    private int totIngredientes;

    public int getTotIngredientes() {
        return totIngredientes;
    }

    public void setTotIngredientes(int totIngredientes) {
        this.totIngredientes = totIngredientes;
    }

    void adicionaIngrediente(){
        for (int x = 0; x < getTotIngredientes(); x++){
            System.out.println("Digite o nome do ingrediente: ");
            
        }
    }

    void getPreco(){
        if (getTotIngredientes() <= 2){
            System.out.println("Custa R$ 15,00 reais.");
        } else if ((getTotIngredientes() >= 3) && (getTotIngredientes() <= 5)) {
            System.out.println("Custa R$ 20,00 reais.");
        } else {
            System.out.println("Custa R$ 23,00 reais.");
        }
    }



}
