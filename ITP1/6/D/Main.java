import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] A = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int v = sc.nextInt();
                A[i][j] = v;
            }
        }


        int[] B = new int[m];
        for (int j = 0; j < m; j++) {
            int v = sc.nextInt();
            B[j] = v;
        }

        int[] C = new int[n];

        for (int i = 0; i < n; i++) {
            int v = 0;
            for (int j = 0; j < m; j++) {
                v += A[i][j] * B[j];
            }
            C[i] = v;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(C[i]);
        }


    }

}
