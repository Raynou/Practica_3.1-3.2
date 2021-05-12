import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {

        Cilindro miCilindro = new Cilindro(3.2f, 5.7f); //Primero va el radio del círculo y luego va la altura del cilindro

        Circulo xd = new Circulo(3.2f);

        Cilindro miOtroCilindro = new Cilindro(xd, 5.7f);
        
        DecimalFormat df = new DecimalFormat("#.00");  
        
        System.out.println(df.format(miCilindro.calcularAreaDelCirculo()));
        //System.out.println(df.format(miCilindro.calcularPerimetroDelCiruclo()));
        System.out.println(df.format(miCilindro.calcularVolumenDelCilindro()));


        System.out.println(df.format(miOtroCilindro.calcularAreaDelCirculo()));
        //System.out.println(df.format(miCilindro.calcularPerimetroDelCiruclo()));
        System.out.println(df.format(miOtroCilindro.calcularVolumenDelCilindro()));
    }    
}
