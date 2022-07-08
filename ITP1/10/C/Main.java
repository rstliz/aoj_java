import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int[] points = new int[n];
            for (int i = 0; i < n; i++) {
                points[i] = sc.nextInt();
            }

            int sum = Arrays.stream(points).sum();
            double avg = sum / (double) n;

            double divSum = 0;
            for (int i = 0; i < n; i++) {
                divSum += Math.pow(points[i] - avg, 2);
            }
            double stdDiv = Math.sqrt(divSum / (double) n);

            System.out.println(String.format("%.6f", stdDiv));
        }



    }
}
