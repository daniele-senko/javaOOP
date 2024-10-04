public class Main {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Maria", 34, "45645646", "3454846487");
        PessoaJuridica pj = new PessoaJuridica("unemat", 25,"664515754","451546879456");

        System.out.println("------------- Relatório de pessoa física ------------- ");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("Idade: " + pf.getIdade());
        System.out.println("Telefone: " + pf.getTelefone());
        System.out.println("CPF: " + pf.getCpf());

        System.out.println("------------- Relatório de pessoa juridica ------------- ");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("Idade: " + pj.getIdade());
        System.out.println("Telefone: " +pj.getTelefone());
        System.out.println("CNPJ: " + pj.getCnpj());
    }
}