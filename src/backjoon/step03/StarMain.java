package backjoon.step03;

import java.util.Scanner;

public class StarMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        for (int i = count - 1; i >= 0; i--) {
            for (int j = 0; j < count; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
