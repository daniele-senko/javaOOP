public class Gato extends Animal {

    public Gato(String nome, int idade, int peso, String raca) {
        super(nome, idade, peso, raca);
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato faz: miau!");
    }
}
