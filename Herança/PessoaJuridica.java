public class PessoaJuridica extends Pessoas {
    private String cnpj;

    public PessoaJuridica(String nome, int idade, String telefone, String cnpj) {
        super(nome, idade, telefone);
        this.cnpj = cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
