import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        String ope;
        while (true) {
            a = sc.nextInt();
            ope = sc.next();
            b = sc.nextInt();

            if (ope.equals("?"))
                break;

            switch (ope) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
            }
        }
    }
}
