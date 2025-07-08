package org.example.problem2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("input.txt"));
        Long[] num = new Long[5];

        Long sum = 0L;
        Long engKatta = Long.MIN_VALUE;
        Long engKichik = Long.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextLong();
            sum += num[i];

            if (num[i] > engKatta) {
                engKatta = num[i];
            }

            if (num[i] < engKichik) {
                engKichik = num[i];
            }
        }

        Long minSum = sum - engKatta;
        Long maxSum = sum - engKichik;

        PrintWriter pw = new PrintWriter(new File("output.txt"));
        StringBuilder add = new StringBuilder();
        add.append(minSum);
        add.append(" ");
        add.append(maxSum);

        String result = add.toString();
        pw.print(result);


        pw.close();
        sc.close();
    }
}
