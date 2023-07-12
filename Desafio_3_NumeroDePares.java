import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio_3_NumeroDePares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int k = scanner.nextInt();

        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithDifferenceK(arr, k);
        System.out.println(count);
    }

    public static int countPairsWithDifferenceK(int[] arr, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            int complement1 = num + k;
            int complement2 = num - k;

            if (frequencyMap.containsKey(complement1)) {
                count += frequencyMap.get(complement1);
            }
            if (frequencyMap.containsKey(complement2)) {
                count += frequencyMap.get(complement2);
            }
        }

        count /= 2;

        return count;
    }
}
