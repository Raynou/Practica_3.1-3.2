import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {

        //Al momento de crear el objeto se pasa como parámetro el área de la base y luego la altura del cilindro

        //Se puede crear un objeto de tipo círculo
        Circulo miCirculo = new Circulo(6.2f);
    
        Cilindro miCilindro = new Cilindro(miCirculo, 5.7f); 

        //Y pasarlo como parámetro en el contructor del cilindro
        Cilindro miOtroCilindro = new Cilindro(miCirculo, 8.9f);
        
        DecimalFormat df = new DecimalFormat("#.00");  
        
        /* Se desde la clase Cilindro se llaman a los métodos heredados de la clase Circulo */
        
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
