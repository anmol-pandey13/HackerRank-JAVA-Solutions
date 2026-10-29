import java.util.*;
import java.io.*;

class Java_Loops_II{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
         
        if(q>=0 && q<=500){
            for(int i=0;i<q;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                
                int sum = a;
                int pow = 1;
                if (a>=0 && b<=50 && n>=1 && n<=50){
                    for (int j=0; j<n; j++){
                        sum += pow * b;
                        System.out.printf(sum + " ");
                        pow *= 2;
                    } 
                
                }
                System.out.println();
               
            }
        }
        in.close();
    }
}