package vehiculos;

public class Main {

    public static void main(String[] args) {

        Automovil auto = new Automovil("Toyota", "Corolla", 180, 4);
        Motocicleta moto = new Motocicleta("Yamaha", "R3", 190, "Deportivo");
        Camion camion = new Camion("Volvo", "FH", 140, 18);

        System.out.println("=== Automóvil ===");
        auto.describir();

        System.out.println("\n=== Motocicleta ===");
        moto.describir();

        System.out.println("\n=== Camión ===");
        camion.describir();
    }
}
