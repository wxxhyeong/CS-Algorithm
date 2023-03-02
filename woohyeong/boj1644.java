// 백준 1644. 소수의 연속합
package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj1644 {
    static int N = 4000000;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[] isPrime = new boolean[N + 1];
        ArrayList<Integer> primeNums = new ArrayList<>();

        for (int i = 2; i * i <= N; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if (!isPrime[i]) {
                primeNums.add(i);
            }
        }

        //System.out.println(primeNums);
        int sum = 0;
        int cnt = 0;
        int start = 0;
        int end = 0;
        sum += primeNums.get(end);

        while (end < primeNums.size() - 1) {
            if (sum == n) {
                cnt++;
                end++;
                sum += primeNums.get(end);
            }
            else if (sum < n) {
                end ++;
                sum += primeNums.get(end);
            }
            else {
                sum -= primeNums.get(start);
                start++;
            }
        }

        System.out.println(cnt);
    }
}
