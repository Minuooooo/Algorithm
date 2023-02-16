package backjoon.step.step08;

import java.util.Scanner;

public class PrimePracticeMain {

    private static boolean[] prime;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        prime = new boolean[n + 1]; //배열 생성
        get_prime();

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = m; i <= n; i++) {
            if (prime[i] == false) { //false = 소수
                sum += i;
                if(min == Integer.MAX_VALUE) //첫 소수가 최솟값
                    min = i;
            }
        }

        if(sum == 0) //소수가 없다면
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }

    }

    // 에라토스테네스 체 알고리즘
    public static void get_prime() {
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i])
                continue;

            for(int j = i * i; j < prime.length; j += i)
                prime[j] = true;
        }
    }
}