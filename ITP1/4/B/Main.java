import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        final double pie = 3.141592653589;

        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double area = pie * r * r;

        double perimeter = 2 * pie * r;

        System.out.println(String.format("%.5f", area) + " " + String.format("%.5f", perimeter));
    }
}
