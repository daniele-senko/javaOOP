public class Quadrado extends Figura{
    @Override
    public double CalcularArea (float a, float b){
        return a * b;
    }

    @Override
    public void imprimir(){
        System.out.println("Área do Quadrado: " + CalcularArea(this.getA(), this.getA()));
    }
}
