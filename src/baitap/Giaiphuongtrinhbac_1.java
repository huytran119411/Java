package baitap;

import java.util.Scanner;

public class Giaiphuongtrinhbac_1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào hệ số a: ");
        float a = nhap.nextFloat();
        System.out.println("Nhập vào hệ số b: ");
        float b = nhap.nextFloat();
        System.out.println("Nhập vào hệ số c: ");
        float c = nhap.nextFloat();
        float ketqua = (c - b) / a;
        if (a == 0) {
            if (b == c) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Nghiệm của phương trình là: " + ketqua);
        }
    }
}
