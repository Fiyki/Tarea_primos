package hilos_1;

public class Consumidor implements Runnable {
    private String nombre;
    private Buffer buffer;

    public Consumidor(String nombre, Buffer buffer) {
        this.nombre = nombre;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Email email = buffer.cogerEmail(nombre);
                // Simular envío de email
                System.out.println("Email enviado a: " + email.getDestinatario() + " desde: " + email.getRemitente() + ", Asunto: " + email.getAsunto() + ", Cuerpo: " + email.getCuerpo());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


