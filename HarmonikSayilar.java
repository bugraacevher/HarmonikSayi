package Giris;

import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("N degerini giriniz : ");
        n = input.nextInt();
        double result =0.0;
        for (double i = 1 ; i<=n ; i++){
            result += (1.0/i);

        }
        System.out.print(result );
    }
}
