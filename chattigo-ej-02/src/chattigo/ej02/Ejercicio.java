package chattigo.ej02;

public class Ejercicio {
    public static void main(String[] args) {
        System.out.println(ejercicio(5));
        System.out.println(ejercicio(2));
    }

    private static String ejercicio(int N) {
        var numElevado = (int) Math.pow(3 + Math.sqrt(5), N);
        var palabra = String.valueOf(numElevado);

        if (palabra.length() - 3 < 0){
            palabra = "0" + palabra;
        }

        return palabra.substring(palabra.length() - 3);
    }
}
