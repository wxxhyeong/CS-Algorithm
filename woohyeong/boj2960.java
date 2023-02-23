package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n, k;
        n = Integer.parseInt(stk.nextToken());
        k = Integer.parseInt(stk.nextToken());

        System.out.println(solution(n,k));
    }

    static int solution(int n, int k) {
        int cnt = 0;

        // n까지 수 배열 생성
        int[] arr = new int[n+1];
        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            // i 값 증가시키면서 소수들과 소수들의 배수를 차례대로 제거한다.
            if (arr[i] == 0)
                continue;

            for (int j = 1; j <= n / i; j++) {
                if (arr[i*j] == 0)
                    continue;
                arr[i*j] = 0;
                cnt++;
                if (cnt == k) {
                    return i*j;
                }
            }
        }

        return 0;
    }
}
