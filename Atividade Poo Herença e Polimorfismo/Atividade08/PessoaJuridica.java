package Atividade08;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String nomeFantasia;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String nomeFantasia) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getnomeFantasia() {
        return nomeFantasia;
    }

    public void setnomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void imprimiDados() {
        System.out.printf("Cliente pessoa fisica");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Telefone: " + super.getTelefone());
        System.out.println("Endereço: " + super.getEndereco());
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
    }
}
