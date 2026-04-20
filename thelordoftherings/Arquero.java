package thelordoftherings;

public class Arquero extends Personaje {

    public Arquero(String nombre, int hp, int ataque) {
        super(nombre, hp, ataque);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " dispara una flecha causando "
                + ataque + " de daño a distancia.");
    }

    @Override
    public String toString() {
        return "[Arquero] " + super.toString();
    }
}
