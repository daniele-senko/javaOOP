public class Triangulo extends Figura {
    @Override
    public double CalcularArea(float a, float b) {
        return (a * b) / 2;
    }

    @Override
    public void imprimir(){
        System.out.println("Area do Triângulo : " + CalcularArea(this.getB(), this.getB()));
    }
}
