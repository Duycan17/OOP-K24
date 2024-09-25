package Week2;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();
        for (int i = 2 ; i<=n ;i+=2) {
            System.out.println(i);
        }
    }
}
