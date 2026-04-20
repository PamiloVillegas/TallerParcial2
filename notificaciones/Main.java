package notificaciones;

public class Main {
    public static void main(String[] args) {

        // --- Email ---
        NotificacionEmail email = new NotificacionEmail(
                "ana@email.com",
                "Tu pedido ha sido confirmado.",
                "2025-04-20",
                "Confirmación de pedido #1234"
        );
        email.enviar();

        System.out.println();

        // --- SMS ---
        NotificacionSMS sms = new NotificacionSMS(
                "Carlos",
                "Tu código de verificación es 8472. No lo compartas con nadie.",
                "2025-04-20",
                "+57 300 123 4567"
        );
        sms.enviar();

        System.out.println();

        // --- Push ---
        NotificacionPush push = new NotificacionPush(
                "Luis",
                "Tienes un nuevo mensaje en la app.",
                "2025-04-20",
                "MiApp",
                NotificacionPush.Prioridad.ALTA
        );
        push.enviar();
    }
}
