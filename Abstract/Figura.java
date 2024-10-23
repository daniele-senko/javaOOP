public abstract class Figura{
    private float  a;
    private float b;

    public Figura(){
        this.a = 10;
        this.b = 10;
    }

    public void setA(float a){
        this.a = a;
    }
    public float getA(){
        return a;
    }

    public void setB(float b){
        this.b = b;
    }
    public float getB(){
        return b;
    }

    public abstract double CalcularArea(float a, float b);

    public abstract void imprimir();
}
