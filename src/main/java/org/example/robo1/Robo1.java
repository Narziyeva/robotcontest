package org.example.robo1;
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Robo1 {
    public static void main(String[] argv) throws FileNotFoundException{

        Scanner sc = new Scanner(new File("src/main/java/org/example/robo1/input.txt"));
        PrintWriter pw = new PrintWriter("src/main/java/org/example/robo1/output.txt");

        int a = sc.nextInt();
        int b = sc.nextInt();

        pw.print(a+b);
        pw.close();
    }
}

