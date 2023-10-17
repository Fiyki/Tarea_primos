package tarea_primos;

public class PrimosMain {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("mete el primer número: ");
		long numero1 = scanner.nextLong();
		System.out.println("mete el segundo número: ");
		long numero2 = scanner.nextLong();
		System.out.println("mete el tercer número: ");
		long numero3 = scanner.nextLong();

		Primos hilo1 = new Primos(numero1);
		Primos hilo2 = new Primos(numero2);
		Primos hilo3 = new Primos(numero3);

		hilo1.start();
		hilo2.start();
		hilo3.start();

		scanner.close();
	}
}