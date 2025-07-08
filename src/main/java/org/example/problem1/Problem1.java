package org.example.problem1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("input.txt"));

        int N = sc.nextInt();
        int K = sc.nextInt();

        int a = K / N;

        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.print(a);

        pw.close();
        sc.close();
    }
}
