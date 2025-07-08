package org.example;

import java.util.Scanner;

public class SecondCommit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sonlar = new int[5];

        long umumiyYigindi = 0;
        int engKatta = Integer.MIN_VALUE;
        int engKichik = Integer.MAX_VALUE;

        System.out.println("5 ta musbat butun son kiriting:");

        for (int i = 0; i < 5; i++) {
            sonlar[i] = scanner.nextInt();
            umumiyYigindi += sonlar[i];

            if (sonlar[i] > engKatta) {
                engKatta = sonlar[i];
            }

            if (sonlar[i] < engKichik) {
                engKichik = sonlar[i];
            }
        }

        long minSum = umumiyYigindi - engKatta;
        long maxSum = umumiyYigindi - engKichik;

        System.out.println("Minimum yig'indi: " + minSum);
        System.out.println("Maksimum yig'indi: " + maxSum);

        scanner.close();
    }
}
