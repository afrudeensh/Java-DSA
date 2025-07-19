package Patterns;

import java.util.Scanner;

public class Normal {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int row =1;
       while(row <=N){
           int col=1;
           while(col<=N){
               System.out.print(col+" ");
               col+=1;
           }
           row+=1;
           System.out.println();
       }
    }
}
