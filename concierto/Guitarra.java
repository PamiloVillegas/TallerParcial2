package concierto;

public class Guitarra extends Instrumento {

    public Guitarra(String nombre, String origen) {
        super(nombre, origen);
    }

    @Override
    public void tocar() {
        System.out.println(nombre + ": ♩ Rasgueo de acordes — Am, F, C, G ♩");
    }
}
