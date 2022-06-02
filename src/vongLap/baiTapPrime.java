package vongLap;

import java.util.Scanner;

public class baiTapPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giới hạn của số Nguyên Tố cần hiển thị:");
        int limit = scanner.nextInt();
        int number = 0;
        while (number < limit) {
            if (isPrime(number)) {
                System.out.println(number);
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
