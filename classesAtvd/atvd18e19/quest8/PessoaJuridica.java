package javaprojects.classesAtvd.atvd18e19.quest8;

public class PessoaJuridica extends Cliente{
    PessoaJuridica(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }
    private String cnpj, nomeFantasia;

    PessoaJuridica pessoajuridica1 = new PessoaJuridica("Carlos", "4042020", "71996433793");
    void imprimirDados(){
        System.out.println("Nome: " + pessoajuridica1.nome +
                "\nEndereço: " + pessoajuridica1.endereco +
                "\nTelefone: " + pessoajuridica1.telefone +
                "\nCPF: " + cnpj +
                "\nNome Fantasia: " + nomeFantasia);
    }
}
