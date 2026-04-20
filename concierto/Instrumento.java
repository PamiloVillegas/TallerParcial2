package concierto;

public class Instrumento {

    protected String nombre;
    protected String origen;   // país de origen

    public Instrumento(String nombre, String origen) {
        this.nombre = nombre;
        this.origen = origen;
    }

    public void tocar() {
        System.out.println("Tocando instrumento genérico");
    }

    @Override
    public String toString() {
        return nombre + " (origen: " + origen + ")";
    }
}
