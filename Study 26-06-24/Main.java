public class Main {
    public static void main(String[] args) {

        // obj 1
        uzumaki naruto = new uzumaki();
        naruto.setNome("Naruto Uzumaki");
        naruto.getNome();
        naruto.idade = 16;
        naruto.temBiju = true;
        naruto.ataqueBase();

        // obj 2

        uchiha sasuke = new uchiha();
        sasuke.setNome("Sasuke Uchiha");
        sasuke.getNome();
        sasuke.idade = 22;
        sasuke.ataqueBase();
        sasuke.ataqueBase(2);

    }
}
