public class Cilindro{

    public Circulo base;
    public float altura;

    public Cilindro(Circulo base, float altura){

        this.base = base;
        this.altura = altura;
    }

    public Cilindro(final Cilindro cilindro){
        this.base = cilindro.base;  
        this.altura = cilindro.altura;
    }

    public Circulo getBase(){
        return base;
    }

    public void setBase(Circulo base){
        this.base =  base;
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


    //Métodos para calcular el área de la base y el volumen del cilindro.
    public double calcularAreaDeLaBase(){
        return base.calcularAreaDelCirculo();
    }    
    
    public double calcularVolumenDelCilindro(){
        return calcularAreaDeLaBase()*altura;
    }

}


    