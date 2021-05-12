public class Circulo {
    public float radio;
    public Punto centro;
    

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Circulo(final Circulo circulo) {
        this.radio = circulo.radio; 
        this.centro = circulo.centro; 
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double calcularAreaDelCirculo(){
        double pi = Math.PI;
        return (Math.pow(radio, 2))*pi;
    }

    public double calcularPerimetroDelCiruclo(){
        return (2*Math.PI)*radio;
    }
}
