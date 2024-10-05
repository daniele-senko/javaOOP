public class Main {
    public static void main(String[] args) {

         Cachorro cachorro = new Cachorro("Chopp", 5,38, "Cachorro");
         exibirFicha(cachorro);
         cachorro.emitirSom();

         Gato gato = new Gato("Mingau", 1, 5, "Gato");
         exibirFicha(gato);
         gato.emitirSom();

    }

    /* método para exibir a ficha dos animais */
    public static void exibirFicha(Animal animal) {

        System.out.println("------------- FICHA PACIENTE -------------");
        System.out.println("Raça: " + animal.getRaca());
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Idade: " + animal.getIdade() + " anos");
        System.out.println("Peso: " + animal.getPeso() + "kg");
    }
}