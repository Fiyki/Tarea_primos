package tarea_primos;

import java.util.Date;

class Primos extends Thread {
	private long numerito;

	public Primos(long numerin) {
		this.numerito = numerin;
	}

	public void run() {
		long startTime = new Date().getTime();
		boolean esPrimo = esPrimo(numerito);
		long endTime = new Date().getTime();
		String estado = esPrimo ? "es primo" : "no es primo";
		System.out.println("El número " + numerito + " " + estado + "  " + (endTime - startTime) + " milisegundos");
	}

	private boolean esPrimo(long numero) {
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}
