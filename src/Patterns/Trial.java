package Patterns;

import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row =1;
        while(row<=N){
            int col=1;
            while(col<=N){
                col+=1;
                System.out.print(row+" ");
            }
            row+=1;
            System.out.println();
        }
    }
}
