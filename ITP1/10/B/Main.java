import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        int c = scan.nextInt();

        double PI = Math.acos(-1);
        double rad = c * PI / 180;

        double S = a * b * Math.sin(rad) / 2;
        double L = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(rad));
        double h = b * Math.sin(rad);

        System.out.println(String.format("%.6f", S));
        System.out.println(String.format("%.6f", L));
        System.out.println(String.format("%.6f", h));
    }
}
