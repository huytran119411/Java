package nam_nhuan;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        if( year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " Là Năm Nhuận");
        }else{
            System.out.println(year + " Không phải năm Nhuận");
        }
    }
}