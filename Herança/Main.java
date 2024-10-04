public class Main {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();

        pf.setNome("João");
        pj.setNome("Pedro");

        System.out.println("Nome pessoa física: " + pf.getNome());
        System.out.println("Nome pessoa jurídica: " + pj.getNome());
    }
}