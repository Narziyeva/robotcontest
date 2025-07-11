package org.example.robo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Robo2 {
    public static void main(String[] argv) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/main/java/org/example/robo2/input.txt"));
        PrintWriter pw = new PrintWriter("src/main/java/org/example/robo2/output.txt");


        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A == B){
            pw.print("=");
        } else if(A < B){
            pw.print("<");
        } else {
            pw.print(">");
        }
        pw.close();
    }
}

