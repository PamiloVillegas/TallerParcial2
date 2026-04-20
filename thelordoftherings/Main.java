package thelordoftherings;

public class Main {
    public static void main(String[] args) {
        Personaje[] equipo = {
                new Guerrero("Aragorn", 100, 25),
                new Mago("Gandalf", 70, 40),
                new Arquero("Legolas", 85, 30)
        };

        System.out.println("=== TURNO DE ATAQUE ===");
        for (Personaje p : equipo) {
            p.atacar();
        }

        System.out.println("\n=== ESTADO DEL EQUIPO ===");
        for (Personaje p : equipo) {
            System.out.println(p);
        }
    }
}
