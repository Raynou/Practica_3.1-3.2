public class Circulo {
    protected float radio;

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
        double pi = Math.PI;
        return (Math.pow(radio, 2))*pi;
    }

    protected double calcularPerimetroDelCiruclo(){
        return (2*Math.PI)*radio;
    }

}
