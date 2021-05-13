public class Cilindro extends Circulo{

    /* Atributos */
    public float altura;
    
    /* Constructores */
    public Cilindro(){return;}
    
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
    

    /* Getters & Setters */
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    /* Métodos propios de la instancia Cilindro */
    public double calcularVolumenDelCilindro(){
        return calcularAreaDelCirculo()*altura;
    }

    
}
