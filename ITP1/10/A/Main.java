import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.println(String.format("%.8f", distance));
    }
}
