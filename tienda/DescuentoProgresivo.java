package tienda;

public class DescuentoProgresivo extends Descuento {

    public DescuentoProgresivo(String nombre) {
        super(nombre);
    }

    @Override
    public double calcular(double precioOriginal) {
        double porcentaje;

        if (precioOriginal > 100000) {
            porcentaje = 15;
        } else if (precioOriginal > 50000) {
            porcentaje = 10;
        } else {
            porcentaje = 5;
        }

        return precioOriginal * porcentaje / 100;
    }
}
