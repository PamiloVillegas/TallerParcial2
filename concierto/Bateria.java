package concierto;

public class Bateria extends Instrumento {

    public Bateria(String nombre, String origen) {
        super(nombre, origen);
    }

    @Override
    public void tocar() {
        System.out.println(nombre + ": ♫ Ritmo — BUM-tss-BUM-BUM-tss ♫");
    }
}
