import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int total = 0;
        int[] sumOFRows = new int[c];
        for (int i = 0; i < r; i++) {
            int sumOfColumns = 0;
            for (int j = 0; j < c; j++) {
                int v = sc.nextInt();
                sumOfColumns += v;
                System.out.print(v + " ");
                sumOFRows[j] += v;
            }
            System.out.println(sumOfColumns);
            total += sumOfColumns;
        }
        for (int i = 0; i < c; i++) {
            System.out.print(sumOFRows[i] + " ");
        }
        System.out.println(total);
    }
}
