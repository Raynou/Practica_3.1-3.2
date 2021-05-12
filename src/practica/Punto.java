
public class Punto {
    public float x;
    public float y;

    public Punto() {
        this.x = 1;
        this.y = 1;
    }

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Punto(final Punto punto) {
        this.x = punto.x;
        this.y = punto.y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }  
}
