public class uchiha extends ninja {
    String nivelDoSharingan = "Sharingan 2";

    public void sharinganAtivado() {
        System.out.println("Sharingan ativado");
    }

    @Override
    public void ataqueBase() {
        System.out.println("Eu sou um ninja e taquei uma Kunai elemento de Fogo");
    }

    public void ataqueBase(int nivelDeChacra) {
        if (nivelDeChacra > 2) {
            System.out.println("Susano ativado");
        } else if (nivelDeChacra < 1) {
            System.out.println("Eu só consegui ativar o Sharingan");
        } else {
            System.out.println("Estou sem chacra");
        }
    }
}
