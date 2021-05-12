public class Cilindro extends Circulo{

    //public Circulo base;
    public float altura;
    public Cilindro(float radio, float altura){

        this.altura = altura;
        this.radio = radio;
    }


    public Cilindro(Circulo circulo, float altura){
        this.altura = altura;
        radio = circulo.getRadio();
    }

    public Cilindro(final Cilindro cilindro){
        this.altura = cilindro.altura;
        this.radio = cilindro.radio;
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double calcularVolumenDelCilindro(){
        return calcularAreaDelCirculo()*altura;
    }

    
}
