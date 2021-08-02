package chattigo.ej01;

public class Ejercicio {
    public static void main(String[] args) {
        System.out.println(ejercicio(31));
        System.out.println(ejercicio(456789));
    }

    public static Integer ejercicio(Integer N) {
        while (true) {
            if (esPalindromo(N)) {
                if (esPrimo(N)) {
                    return N;
                }
            }
            N++;
        }
    }

    public static boolean esPalindromo(int numero) {
        var palabra = String.valueOf(numero);

        for (int i = 0, j = palabra.length() - 1; i <= j; i++, --j) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public static Boolean esPrimo(int numero) {
        var esPrimo = true;

        if (numero < 2) {
            esPrimo = false;
        } else {
            for (int x = 2; x * x <= numero; x++) {
                if (numero % x == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        return esPrimo;
    }
}
