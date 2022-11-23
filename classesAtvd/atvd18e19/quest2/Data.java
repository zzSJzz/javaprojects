package javaprojects.classesAtvd.atvd18e19.quest2;

public class Data {
    private final int dia;
    private final int mes;
    private final int ano;

    private String mes2;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }


    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }


    void validarData() {

        // Aqui ele vai verificar se os numeros adicionados estão nos padrões corretos

        if (getDia() <= 31 & getDia() >= 1){
            System.out.println("Você digitou um dia válido. \n");
        }
        else {
            System.out.println("Você digitou um dia inválido. \n");
            System.exit(0);
        }

        if (getMes() <= 12 & getMes() >= 1){
            System.out.println("Você digitou um mês válido. \n");
        }
        else {
            System.out.println("Você digitou um mês inválido. \n");
            System.exit(0);
        }

        //Aqui ele vai transformar o mes int em cursivo

        switch (getMes()) {
            case 1 -> mes2 = "Janeiro";
            case 2 -> mes2 = "Fervereiro";
            case 3 -> mes2 = "Março";
            case 4 -> mes2 = "Abril";
            case 5 -> mes2 = "Maio";
            case 6 -> mes2 = "Junho";
            case 7 -> mes2 = "Julho";
            case 8 -> mes2 = "Agosto";
            case 9 -> mes2 = "Setembro";
            case 10 -> mes2 = "Outubro";
            case 11 -> mes2 = "Novembro";
            case 12 -> mes2 = "Dezembro";
        }


        if (getMes() <= 3000 & getMes() >= 0){
            System.out.println("Você digitou um ano válido. \n");

        }
        else {
            System.out.println("Você digitou um ano inválido. \n");
            System.exit(0);
        }
        if (getAno() % 400 == 0){
            System.out.println("O ano é bissexto \n");
        } else if (getAno() % 4 == 0 & getAno() % 100 != 0) {
            System.out.println("O ano é bissexto \n");
        }
        else {
            System.out.println("O ano não é bissexto \n");
        }
    }

    public String toString(){
        return getDia() + " de " + getMes() + " de " + mes2 + " de " + getAno();
    }


}
