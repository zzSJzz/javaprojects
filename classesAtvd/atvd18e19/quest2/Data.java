package javaprojects.classesAtvd.atvd18e19.quest2;

public class Data {
    private int dia, mes, ano;

    private String mes2;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes2;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    void validarData() {

        // Aqui ele vai verificar se os numeros adicionados estão nos padrões corretos

        if (dia <= 31 & dia >= 1){
            System.out.println("Você digitou um dia válido. \n");
        }
        else {
            System.out.println("Você digitou um dia inválido. \n");
            System.exit(0);
        }

        if (mes <= 12 & mes >= 1){
            System.out.println("Você digitou um mês válido. \n");
        }
        else {
            System.out.println("Você digitou um mês inválido. \n");
            System.exit(0);
        }

        //Aqui ele vai transformar o mes int em cursivo

        switch (mes){
            case 1:
                mes2 = "Janeiro";
                break;

            case 2:
                mes2 = "Fervereiro";
                break;

            case 3:
                mes2 = "Março";
                break;

            case 4:
                mes2 = "Abril";
                break;

            case 5:
                mes2 = "Maio";
                break;

            case 6:
                mes2 = "Junho";
                break;

            case 7:
                mes2 = "Julho";
                break;

            case 8:
                mes2 = "Agosto";
                break;

            case 9:
                mes2 = "Setembro";
                break;

            case 10:
                mes2 = "Outubro";
                break;

            case 11:
                mes2 = "Novembro";
                break;

            case 12:
                mes2 = "Dezembro";
                break;
        }


        if (ano <= 3000 & ano >= 0){
            System.out.println("Você digitou um ano válido. \n");

        }
        else {
            System.out.println("Você digitou um ano inválido. \n");
            System.exit(0);
        }
        if (ano % 400 == 0){
            System.out.println("O ano é bissexto \n");
        } else if (ano % 4 == 0 & ano % 100 != 0) {
            System.out.println("O ano é bissexto \n");
        }
        else {
            System.out.println("O ano não é bissexto \n");
        }
    }

    public String toString(){
        return getDia() + " de " + getMes() + " de " + getAno();
    }


}
