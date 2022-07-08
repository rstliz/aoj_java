import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W, H;

        while (true) {
            H = sc.nextInt();
            W = sc.nextInt();
            if (W == 0 && H == 0) {
                break;
            }

            for (int h = 0; h < H; h++) {
                for (int w = 0; w < W; w++) {
                    if (h == 0 || h == H - 1 || w == 0 || w == W - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }

                }
                System.out.println();
            }
            System.out.println();

        }
    }
}
