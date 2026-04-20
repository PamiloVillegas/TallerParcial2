package notificaciones;

public class NotificacionEmail extends Notificacion {

    private String asunto;

    public NotificacionEmail(String destinatario, String mensaje, String fechaEnvio, String asunto) {
        super(destinatario, mensaje, fechaEnvio);
        this.asunto = asunto;
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("Asunto          : " + asunto);
    }
}
