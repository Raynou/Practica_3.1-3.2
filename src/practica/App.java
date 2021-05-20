import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {

        //Al momento de crear el objeto se pasa como parámetro el área de la base y luego la altura del cilindro

        Circulo miCirculo = new Circulo(6.2f);
    
        Cilindro miCilindro = new Cilindro(miCirculo, 5.7f); 

        Cilindro miOtroCilindro = new Cilindro(miCirculo, 8.9f);
        
        DecimalFormat df = new DecimalFormat("#.00");  
        
        
        /* Primer cilindro */
        
        System.out.println("El área del la base del cilindro es: " +
            df.format(miCilindro.calcularAreaDeLaBase()));

        System.out.println("El volumen del cilindro es: " +
            df.format(miCilindro.calcularVolumenDelCilindro()));

        System.out.println("=========================================");

        /* Segundo cilindro */

        System.out.println("El área de la base del cilindro es: " +
            df.format(miOtroCilindro.calcularAreaDeLaBase()));


        System.out.println("El volumen del cilindro es: " +
            df.format(miOtroCilindro.calcularVolumenDelCilindro()));
    }    
}
