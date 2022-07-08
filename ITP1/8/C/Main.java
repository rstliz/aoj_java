import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        int[] counter = new int[26];

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.next().toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (str.charAt(i) < 'a' || str.charAt(i) > 'z') {
                    continue;
                }
                int num = c - 'a';
                counter[num]++;
            }
        }

        for (int i = 0; i < counter.length; i++) {
            System.out.println((char) (i + 'a') + " : " + counter[i]);
        }

    }
}
