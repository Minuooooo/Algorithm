package baekjoon.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2559_수열 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] temp = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = K - 1;
        int max = Integer.MIN_VALUE;

        while (end < N) {

            int sum = 0;

            for (int i = start; i <= end; i++) {
                sum += temp[i];
            }

            max = Math.max(max, sum);

            start++;
            end++;
        }

        System.out.println(max);
    }
}