package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5376 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int start, end;
            StringBuilder sbNum = new StringBuilder();

            String input = br.readLine();
            input = input.substring(2, input.length());

            for (int k = 0; k < input.length(); k++) {
                if (
            }






















            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '(') {
                    start = j + 1;
                } else if (input.charAt(j) == ')') {
                    end = j + 1;
                } else {
                    sbNum.append(input.charAt(j));
                }
            }

            System.out.println(sbNum);



        }
    }
}
