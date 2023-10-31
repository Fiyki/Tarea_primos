package hilos_1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Buffer {
    private BlockingQueue<Email> buffer;
    private final int CAPACIDAD_MAXIMA = 5;

    public Buffer() {
        buffer = new ArrayBlockingQueue<>(CAPACIDAD_MAXIMA);
    }

    public void ponerEmail(Email email, String nombreProductor) throws InterruptedException {
        if (email.getDestinatario().equals("pikachu@gmail.com")) {
            System.out.println("Email descartado por destinatario inválido: " + email.getId());
        } else {
            buffer.put(email);
            System.out.println(nombreProductor + " ha puesto el email " + email.getId() + " en el buffer.");
        }
    }

    public Email cogerEmail(String nombreConsumidor) throws InterruptedException {
        Email email = buffer.take();
        System.out.println(nombreConsumidor + " ha cogido el email " + email.getId() + " del buffer.");
        return email;
    }
}


