public class Animal {
    protected String nome;
    protected int idade;
    protected int peso;
    protected String raca;

    public Animal(String nome, int idade, int peso, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getPeso() {
        return peso;
    }


    public String getRaca() {
        return raca;
    }

    // método para emitir som
    public void emitirSom() {
        System.out.println("Este animal emitiu som.");
    }

}
