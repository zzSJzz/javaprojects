package javaprojects.classesAtvd.atvd18e19.quest8;

public class PessoaFisica extends Cliente {
    PessoaFisica(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }
    private String cpf;

    PessoaFisica pessoaFisica1 = new PessoaFisica("Carlos", "4042020", "71996433793");
    void imprimirDados(){
        System.out.println("Nome: " + pessoaFisica1.nome +
                "\nEndereço: " + pessoaFisica1.endereco +
                "\nTelefone: " + pessoaFisica1.telefone +
                "\nCPF: " + cpf);
    }
}