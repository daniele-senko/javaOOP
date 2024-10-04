public class PessoaFisica extends Pessoas{
    private String cpf;

    public PessoaFisica(String nome, int idade, String telefone, String cpf) {
        super(nome, idade, telefone);
        this.cpf = cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
}

