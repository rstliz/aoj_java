import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        long min = Collections.min(a);
        long max = Collections.max(a);
        long sum = a.stream().mapToLong(i -> i).sum();

        System.out.println(min + " " + max + " " + sum);

    }
}
