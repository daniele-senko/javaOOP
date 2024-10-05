public class Cachorro extends Animal {

    public Cachorro(String nome, int idade, int peso, String raca) {
        super(nome, idade, peso, raca);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz: au au!");
    }
}
