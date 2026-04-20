package notificaciones;

public class Notificacion {

    protected String destinatario;
    protected String mensaje;
    protected String fechaEnvio;

    public Notificacion(String destinatario, String mensaje, String fechaEnvio) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
    }

    public void enviar() {
        System.out.println("--- Enviando notificación ---");
        System.out.println("Destinatario : " + destinatario);
        System.out.println("Mensaje      : " + mensaje);
        System.out.println("Fecha envío  : " + fechaEnvio);
    }
}
