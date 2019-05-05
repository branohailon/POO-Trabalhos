package Atividade08;

public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public void imprimiDados() {
        System.out.printf("Cliente pessoa fisica");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Telefone: " + super.getTelefone());
        System.out.println("Endereco: " + super.getEndereco());
        System.out.println("CPF: " + cpf);
    }
}
