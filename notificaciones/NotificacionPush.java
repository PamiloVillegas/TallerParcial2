package notificaciones;

public class NotificacionPush extends Notificacion {

    public enum Prioridad {
        ALTA,
        MEDIA,
        BAJA
    }

    private String aplicacion;
    private Prioridad prioridad;

    public NotificacionPush(String destinatario, String mensaje,
                            String fechaEnvio, String aplicacion, Prioridad prioridad) {
        super(destinatario, mensaje, fechaEnvio);
        this.aplicacion = aplicacion;
        this.prioridad = prioridad;
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("Aplicación   : " + aplicacion);
        System.out.println("Prioridad    : " + prioridad);
    }
}
