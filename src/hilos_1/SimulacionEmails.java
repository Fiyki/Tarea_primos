package hilos_1;

public class SimulacionEmails {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Thread productor1 = new Thread(new Productor("Productor 1", buffer, 10));
        Thread productor2 = new Thread(new Productor("Productor 2", buffer, 10));
        Thread productor3 = new Thread(new Productor("Productor 3", buffer, 10));

        Thread consumidor1 = new Thread(new Consumidor("Consumidor 1", buffer));
        Thread consumidor2 = new Thread(new Consumidor("Consumidor 2", buffer));

        productor1.start();
        productor2.start();
        productor3.start();

        consumidor1.start();
        consumidor2.start();
    }
}
