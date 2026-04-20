package thelordoftherings;

public class Personaje {

    protected String nombre;
    protected int hp;       //Health Points
    protected int ataque;

    public Personaje(String nombre, int hp, int ataque) {
        this.nombre = nombre;
        this.hp     = hp;
        this.ataque = ataque;
    }

    public void atacar() {
        System.out.println(nombre + " ataca.");
    }

    @Override
    public String toString() {
        return nombre + " | HP: " + hp + " | Ataque: " + ataque;
    }
}
