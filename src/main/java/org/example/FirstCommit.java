package org.example;

import java.io.IOException;
import java.util.Scanner;

public class FirstCommit {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input N: ");
        int N = sc.nextInt();

        System.out.print("Please input K: ");
        int K = sc.nextInt();

        if (N == 0) {
            System.out.println("0 bo'lishi mumkin emas");
        } else {
            int a = K / N;

            System.out.println(a);
        }
        sc.close();
    }
}
