public class Circulo {
    protected static final double PI = Math.PI;
    protected float radio;
    protected Punto centro;

    //Constructor por defecto
    public Circulo(){
        this.centro = new Punto();
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public Circulo(final Circulo circulo) {
        this.radio = circulo.radio; 
    }
    protected float getRadio() {
        return radio;
    }

    protected void setRadio(float radio) {
        this.radio = radio;
    }

    public String getCentro() {
        return "X: " + centro.getX()+", Y: " +  centro.getY();
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    protected double calcularAreaDelCirculo(){
        return (Math.pow(radio, 2))*PI;
    }

    protected double calcularPerimetroDelCiruclo(){
        return (2*PI)*radio;
    }

}
