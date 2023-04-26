package baekjoon.step.condition;

import java.util.Scanner;

public class Oven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int takeTime = scanner.nextInt();

        int calMinute = minute + takeTime;

        if (calMinute >= 60) {
            while (calMinute >= 60) {
                hour++;
                calMinute -= 60;

                if(hour == 24)
                    hour = 0;
            }
            System.out.println(hour + " " + calMinute);
        } else {
            System.out.println(hour + " " + calMinute);
        }
    }
}
