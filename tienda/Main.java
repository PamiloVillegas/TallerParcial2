package tienda;

public class Main {
    public static void main(String[] args) {

        double precio = 80000;

        Descuento[] descuentos = {
                new DescuentoPorcentaje("Descuento 20%", 20),
                new DescuentoFijo("Descuento fijo $15.000", 15000),
                new DescuentoProgresivo("Descuento progresivo")
        };

        System.out.println("Precio original: $" + precio);
        System.out.println("========================================");

        for (Descuento d : descuentos) {
            double montoDescuento = d.calcular(precio);
            double precioFinal    = precio - montoDescuento;

            System.out.println("Tipo         : " + d);
            System.out.println("Descuento    : $" + montoDescuento);
            System.out.println("Precio final : $" + precioFinal);
            System.out.println("----------------------------------------");
        }
    }
}
