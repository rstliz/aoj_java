import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == 0 && y == 0)
                break;

            if (x <= y) {
                System.out.println(x + " " + y);
            } else {
                System.out.println(y + " " + x);
            }
        }
    }
}
