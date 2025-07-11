package org.example.robo5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Robo5 {
    public static void main(String[] argv) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/main/java/org/example/robo5/input.txt"));
        PrintWriter pw = new PrintWriter("src/main/java/org/example/robo5/output.txt");

        int Z = sc.nextInt();

        int juftliklarSoni = 0;

        for (int x = -Math.abs(Z); x <= Math.abs(Z); x++) {
            if (x == 0) continue;
            if (Z % x == 0) {
                int y = Z / x;
                if (x <= y) {
                    juftliklarSoni++;
                }
            }
        }

        pw.print(juftliklarSoni);
        pw.close();
        sc.close();
    }
}

