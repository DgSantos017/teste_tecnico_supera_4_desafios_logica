import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio_1_OrdenacaoParesImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 

        List<Integer> valores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt(); 
            valores.add(valor);
        }

        List<Integer> ordenados = ordenarParesImpares(valores);

        for (int valor : ordenados) {
            System.out.println(valor); 
        }
    }

    public static List<Integer> ordenarParesImpares(List<Integer> valores) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int valor : valores) {
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        pares.addAll(impares);
        return pares;
    }
}
