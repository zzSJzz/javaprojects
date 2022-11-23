package javaprojects.classesAtvd.atvd18e19.quest6;

import javaprojects.classesAtvd.atvd18e19.quest2.Data;

public class RegistroAcademico {

    //Parametros

    private String nomeDoAluno, numeroDaMatricula;
    private Data dataDeNascimento;
    private boolean eBolsista;
    private int anoDaMatricula;

    private float mensalidade;

    public boolean iseBolsista() {
        return eBolsista;
    }

    public void seteBolsista(boolean eBolsista) {
        this.eBolsista = eBolsista;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    void inicializaRegistro(String nomeDoAluno, String numeroDaMatricula,
                            int anoDaMatricula){
        this.nomeDoAluno = nomeDoAluno;
        this.numeroDaMatricula = numeroDaMatricula;
        this.dataDeNascimento = new Data(19, 6, 2003);
        this.anoDaMatricula = anoDaMatricula;
        setMensalidade(400);
    }



    void calculaMensalidade(){
        if (iseBolsista()){
            setMensalidade(getMensalidade() / 2);
        }
    }

    void mostraRegistro(){
        System.out.printf("""
                        Registro Acadêmico
                        Nome: %s
                        Número do aluno: %s""",
                nomeDoAluno, numeroDaMatricula);
        System.out.println("\nData de nascimento: " + dataDeNascimento +
                "\nÉ bolsista: " + iseBolsista() +
                        "\nAno de matrícula: " + anoDaMatricula +
                "\nValor da mensalidade: R$ " + getMensalidade());

    }



}
