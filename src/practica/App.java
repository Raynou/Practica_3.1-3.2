import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        Punto miCentro = new Punto(3,2);
        Circulo miCirculo = new Circulo(miCentro, 3.2f);
        Cilindro mCilindro = new Cilindro(miCirculo, 5.7f);
        
        DecimalFormat df = new DecimalFormat("#.00");  

        System.out.println("La coordenadas del centro del círculo son:\n X: " + miCentro.getX()+"\n Y: " + miCentro.getY());

        System.out.println("El radio del círculo es: " + df.format(miCirculo.calcularPerimetroDelCiruclo()));

        System.out.println("El área del círculo es: " + df.format(miCirculo.calcularAreaDelCirculo()) + "\nSu perímetro es: "+df.format(miCirculo.calcularPerimetroDelCiruclo()));

        System.out.println("El área de la base del cilindro es de: " + df.format(mCilindro.calcularAreaDeLaBase()));
        
        System.out.println("El volumen del cilindro es de: " +df.format(mCilindro.calcularVolumenDelCilindro()));

    }
}