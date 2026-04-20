package formasgeometricas;

public class Main {
    public static void main(String[] args) {
        Forma f1 = new Cuadrado();
        Forma f2 = new Circulo();
        //Cuadrado c = new Forma();
        Cuadrado c = new Cuadrado(); //correccion
        f1.dibujar();
        //f1.calcularArea(5);
        if (f1 instanceof Cuadrado) {
            ((Cuadrado) f1).calcularArea(5); //correccion
            f2.dibujar();
            //Cuadrado q = (Cuadrado) f2;
            if (f2 instanceof Cuadrado) { //correccion
                Cuadrado q = (Cuadrado) f2;
                q.calcularArea(4);
            } else {
                System.out.println("f2 no es un Cuadrado, es un Círculo");
            }
        }
    }
}