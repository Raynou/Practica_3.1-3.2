import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {

        Cilindro miCilindro = new Cilindro(3.2f, 5.7f); //Primero va el radio del círculo y luego va la altura del cilindro
        
        DecimalFormat df = new DecimalFormat("#.00");  

        /* System.out.println("El radio del círculo es: " + df.format(miCirculo.calcularPerimetroDelCiruclo()));

        System.out.println("El área del círculo es: " + df.format(miCirculo.calcularAreaDelCirculo()) + "\nSu perímetro es: "+df.format(miCirculo.calcularPerimetroDelCiruclo()));

        System.out.println("El área de la base del cilindro es de: " + df.format(mCilindro.calcularAreaDeLaBase()));
        
        System.out.println("El volumen del cilindro es de: " +df.format(mCilindro.calcularVolumenDelCilindro())); */        
        
        System.out.println(df.format(miCilindro.calcularAreaDelCirculo()));
        //System.out.println(df.format(miCilindro.calcularPerimetroDelCiruclo()));
        System.out.println(df.format(miCilindro.calcularVolumenDelCilindro()));
    }
}