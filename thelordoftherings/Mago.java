package thelordoftherings;

public class Mago extends Personaje {

    public Mago(String nombre, int hp, int ataque) {
        super(nombre, hp, ataque);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza un hechizo causando "
                + ataque + " de daño mágico.");
    }

    @Override
    public String toString() {
        return "[Mago] " + super.toString();
    }
}
