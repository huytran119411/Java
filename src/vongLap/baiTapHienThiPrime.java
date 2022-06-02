package vongLap;

import java.util.Scanner;

public class baiTapHienThiPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số Nguyên Tố cần hiển thị:");
        int soHienthi = scanner.nextInt();
        int count = 0;
        int number = 0;
        while (count < soHienthi) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
