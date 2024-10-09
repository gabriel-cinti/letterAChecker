package letterAChecker;

import java.util.Scanner;

public class LetraAChecker {

    // Método para contar a ocorrência de 'a' e 'A' na string
    public static int contarLetraA(String texto) {
        int contador = 0;

        // Itera sobre cada caractere da string
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            // Verifica se o caractere é 'a' ou 'A'
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            // Entrada da string pelo usuário
            System.out.print("Digite uma palavra: ");
            String texto = scanner.nextLine();

            // Chama o método para contar a quantidade de 'a' e 'A'
            int quantidade = contarLetraA(texto);

            // Exibe o resultado
            if (quantidade > 0) {
                System.out.println("A letra 'A' aparece " + quantidade + " vezes na string.");
            } else {
                System.out.println("A letra 'A' não aparece na string.");
            }

            // Pergunta se o usuário deseja verificar outra string
            System.out.print("Deseja verificar outra string? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s")); // Continua enquanto o usuário responder "s"

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
