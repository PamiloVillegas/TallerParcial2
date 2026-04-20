package thelordoftherings;

public class Guerrero extends Personaje {

    public Guerrero(String nombre, int hp, int ataque) {
        super(nombre, hp, ataque);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con su espada causando "
                + ataque + " de daño físico.");
    }

    @Override
    public String toString() {
        return "[Guerrero] " + super.toString();
    }
}
