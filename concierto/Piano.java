package concierto;

public class Piano extends Instrumento {

    public Piano(String nombre, String origen) {
        super(nombre, origen);
    }

    @Override
    public void tocar() {
        System.out.println(nombre + ": ♪ Teclas — Do Re Mi Fa Sol La Si ♪");
    }
}
