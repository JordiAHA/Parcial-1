import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();

        int contadorVocales = contarVocales(texto);

        System.out.println("El número de vocales en la cadena es: " + contadorVocales);
    }

    public static int contarVocales(String texto) {
        int contador = 0;
        String textoLower = texto.toLowerCase(); 

        for (char c : textoLower.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        return contador;
    }
}
