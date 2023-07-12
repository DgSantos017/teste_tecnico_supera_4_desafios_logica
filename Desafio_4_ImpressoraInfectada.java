import java.util.Scanner;

public class Desafio_4_ImpressoraInfectada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String original = decipherLine(line);
            System.out.println(original);
        }
    }

    public static String decipherLine(String line) {
        int length = line.length();
        StringBuilder sb = new StringBuilder(length);

        for (int i = length / 2 - 1; i >= 0; i--) {
            sb.append(line.charAt(i));
        }

        for (int i = length - 1; i >= length / 2; i--) {
            sb.append(line.charAt(i));
        }

        return sb.toString();
    }
}
