public class Circulo {
    protected float radio;

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
