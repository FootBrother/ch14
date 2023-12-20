package ch14;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入一個整數 n: ");

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int sum = calculateSum(n);
            System.out.println("1 + 2 + ... + " + n + " = " + sum);
        } else {
            System.out.println("輸入的不是整數 ");
        }
        sc.close();
    }

    private static int calculateSum(int n) {
        return n * (n + 1) / 2;
    }
}
