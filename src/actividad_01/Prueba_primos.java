package actividad_01;

import java.math.BigInteger;

public class Prueba_primos {
	public static void main(String[] args) {
        BigInteger numero = new BigInteger("10").pow(400); // Empezamos con un número grande

        while (true) {
            if (esPalindromo(numero.toString()) && esPrimo(numero)) {
                System.out.println("Número primo palindrómico: " + numero);
            }
            numero = numero.add(BigInteger.ONE); // Verificamos números sucesivos
        }
    }

    public static boolean esPrimo(BigInteger numero) {
        if (numero.compareTo(BigInteger.ONE) <= 0) {
            return false;
        }
        if (numero.compareTo(BigInteger.valueOf(3)) <= 0) {
            return true;
        }
        if (numero.mod(BigInteger.TWO).equals(BigInteger.ZERO) || numero.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
            return false;
        }
        BigInteger limite = numero.sqrt();
        for (BigInteger i = BigInteger.valueOf(5); i.compareTo(limite) <= 0; i = i.add(BigInteger.valueOf(6))) {
            if (numero.mod(i).equals(BigInteger.ZERO) || numero.mod(i.add(BigInteger.valueOf(2))).equals(BigInteger.ZERO)) {
                return false;
            }
        }
        return true;
    }

    public static boolean esPalindromo(String cadena) {
        return cadena.equals(new StringBuilder(cadena).reverse().toString());
    }
}
