package hilos_1;

public class Productor implements Runnable {
    private String nombre;
    private Buffer buffer;
    private int cantidadEmails;

    public Productor(String nombre, Buffer buffer, int cantidadEmails) {
        this.nombre = nombre;
        this.buffer = buffer;
        this.cantidadEmails = cantidadEmails;
    }

    @Override
    public void run() {
        for (int i = 1; i <= cantidadEmails; i++) {
            try {
                Email email = new Email(i, "destinatario" + i + "@dominio.com", "remitente" + i + "@dominio.com", "Asunto " + i, "Cuerpo del mensaje " + i);
                buffer.ponerEmail(email, nombre);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
