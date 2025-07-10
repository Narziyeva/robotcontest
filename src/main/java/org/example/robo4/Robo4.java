package org.example.robo4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Robo4 {
    public static void main(String[] argv) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/main/java/org/example/robo4/input.txt"));
        PrintWriter pw = new PrintWriter("src/main/java/org/example/robo4/output.txt");
    long N = sc.nextLong();
    long P = sc.nextLong();
    sc.close();
    long result = N * P;

    pw.print(result);
    pw.close();
}

}
