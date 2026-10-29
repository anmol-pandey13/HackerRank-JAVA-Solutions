import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.regex.*;



public class Java_Loops_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        if (N>=2 && N<=20){
            for(int i=1; i<=10; i++){
                int mul = N*i;
                System.out.println(N + " x " + i + " = " + mul);
            }
        } 
    }
    
}
