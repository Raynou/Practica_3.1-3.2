public class Circulo {
    protected float radio;
    protected static final double PI = Math.PI;
    //Constructor por defecto
    public Circulo(){return;}

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

    protected double calcularAreaDelCirculo(){
        return (Math.pow(radio, 2))*PI;
    }

    protected double calcularPerimetroDelCiruclo(){
        return (2*PI)*radio;
    }

}
