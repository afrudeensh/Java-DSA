package Patterns;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row = 1;
        while(row<=N){
            row+=1;

            int col=1;
            while(col<=N){
                col+=1;
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
