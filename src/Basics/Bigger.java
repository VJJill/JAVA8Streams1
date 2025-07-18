package Basics;

import java.util.Scanner;

// Bigger Class 
public class Bigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
            System.out.println("a is bigger than b");
    }
}
