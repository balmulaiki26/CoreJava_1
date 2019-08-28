package dataStructures.array;

import java.util.Random;
import java.util.Scanner;
public class ScannerArray {


    public static void main(String[] args) {
        int [] studentId = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            int newValue = scanner.nextInt(100);
            studentId[i] = newValue;
        }
        System.out.println(studentId.length);
        for(int i=0;i<studentId.length;i++) {
            System.out.println(studentId[i]);
        }
    }
    }
