public class Cilindro extends Circulo{

    /* Atributos */
    public float altura;
    public Circulo base;

    /* Constructores */
    public Cilindro(){return;}
    
    public Cilindro(Circulo base, float altura){

        this.altura = altura;
        this.base = base;
    }

    public Cilindro(final Cilindro cilindro){
        this.altura = cilindro.altura;
        this.base = cilindro.base;
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
