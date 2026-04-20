package concierto;

public class Main {

    public static void darConcierto(Instrumento[] banda) {
        System.out.println("*** Iniciando concierto — " + banda.length + " músicos ***");
        System.out.println();
        for (Instrumento instrumento : banda) {
            instrumento.tocar();
        }
        System.out.println();
        System.out.println("*** Fin del concierto ***");
    }

    public static void main(String[] args) {

        // Arreglo MIXTO: distintos tipos, pero todos caben porque son Instrumento
        Instrumento[] banda = {
                new Guitarra("Fender Stratocaster", "Estados Unidos"),
                new Piano("Steinway", "Alemania"),
                new Bateria("Pearl Masters", "Japón"),
                new Guitarra("Gibson Les Paul", "Estados Unidos"),
                new Instrumento("Triángulo", "Desconocido")  // clase base directa
        };

        darConcierto(banda);

        }
    }
