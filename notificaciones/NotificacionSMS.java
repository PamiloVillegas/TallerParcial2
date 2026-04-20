package notificaciones;

public class NotificacionSMS extends Notificacion {

    private String numeroTelefono;

    public NotificacionSMS(String destinatario, String mensaje,
                           String fechaEnvio, String numeroTelefono) {
        super(destinatario, mensaje, fechaEnvio);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviar() {
        super.enviar();

        String mensajeLimitado = mensaje;
        if (mensaje.length() > 160) {
            mensajeLimitado = mensaje.substring(0, 160);
            System.out.println("AVISO: mensaje cortado a 160 caracteres");
        }

        System.out.println("Teléfono     : " + numeroTelefono);
        System.out.println("Mensaje SMS  : " + mensajeLimitado);
        System.out.println("Longitud     : " + mensajeLimitado.length() + " caracteres");
    }
}
