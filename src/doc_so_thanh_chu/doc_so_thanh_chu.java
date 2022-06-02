package doc_so_thanh_chu;

import java.util.Scanner;

public class doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số Cần Đọc Là: ");
        int number = scanner.nextInt();

        if (number <= 9 && number > 0) {
            switch (number) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Sevent");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }

        if (number >=10 && number <20){
            switch (number) {
                case 11:
                    System.out.println("Elevent");
                    break;
                case 12:
                    System.out.println("Twelve");
               break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
            }
        }

        if (number >= 20 && number <= 99) {
            int a = number / 10;
            int b = number % 10;
            String hangChuc="";
            String hangDonVi="";
            switch (a) {
                case 2:
                    hangChuc = "Twenty";
                    break;
                case 3:
                    hangChuc = "Thirty";
                    break;
                case 4:
                    hangChuc = "Fourty";
                    break;
                case 5:
                    hangChuc = "Fifty";
                    break;
                case 6:
                    hangChuc = "Sixty";
                    break;
                case 7:
                    hangChuc = "Seventy";
                    break;
                case 8:
                    hangChuc = "Eighty";
                    break;
                case 9:
                    hangChuc = "Ninety";
                    break;
            }
            switch (b){
                case 1:
                    hangDonVi="One";
                    break;
                case 2:
                    hangDonVi="Two";
                    break;
                case 3:
                    hangDonVi="Three";
                    break;
                case 4:
                    hangDonVi="Four";
                    break;
                case 5:
                    hangDonVi="Five";
                    break;
                case 6:
                    hangDonVi="Six";
                    break;
                case 7:
                    hangDonVi="Sevent";
                    break;
                case 8:
                    hangDonVi="Eight";
                    break;
                case 9:
                    hangDonVi="Nine";
                    break;
            }
            System.out.print(hangChuc+" "+hangDonVi);
        }
        if (number >= 100 && number <= 999) {
            int a = number / 100;
            int b = number /10;
            int c = b/10;
            int d = c%10;
            String hangTram="";
            String hangChuc="";
            String hangDonVi="";

            switch (a) {
                case 1:
                    hangTram = "One hundred";
                    break;
                case 2:
                    hangTram = "Two hundred";
                    break;
                case 3:
                    hangTram = "Three hundred";
                    break;
                case 4:
                    hangTram = "Four hundred";
                    break;
                case 5:
                    hangTram = "Five hundred";
                    break;
                case 6:
                    hangTram = "Six hundred";
                    break;
                case 7:
                    hangTram = "Sevent hundred";
                    break;
                case 8:
                    hangTram = "Eight hundred";
                    break;
                case 9:
                    hangTram = "Nine hundred";
                    break;
            }
                switch (c) {
                    case 1
                    case 2:
                        hangChuc = "Twenty";
                        break;
                    case 3:
                        hangChuc = "Thirty";
                        break;
                    case 4:
                        hangChuc = "Fourty";
                        break;
                    case 5:
                        hangChuc = "Fifty";
                        break;
                    case 6:
                        hangChuc = "Sixty";
                        break;
                    case 7:
                        hangChuc = "Seventy";
                        break;
                    case 8:
                        hangChuc = "Eighty";
                        break;
                    case 9:
                        hangChuc = "Ninety";
                        break;
                }

        }
    }
}