package backjoon.step09;

import java.util.Scanner;

public class ConfettiMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int confettiNum = scanner.nextInt();
        int[][] area = new int[100][100];
        int count = 0;

        for (int i = 0; i < confettiNum; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    area[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                if(area[i][j] == 1)
                    count++;
            }
        }

        System.out.println(count);
    }
}
