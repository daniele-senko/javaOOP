public class ninja {
    // classe é um molde para fazer os objetos
    private String nome;
    String aldeia;
    int idade;

    /* Getter - criar getter para mostrar para o usuário */
    public String getNome() {
        return nome;
    }

    /* Setter - Settar o valor da variável */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void ataqueBase() {
        System.out.println("Eu sou um ninja e taquei uma Kunai");
    }
}
