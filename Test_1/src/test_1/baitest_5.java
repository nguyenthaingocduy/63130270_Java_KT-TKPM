package test_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class baitest_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap ten cua ban: ");
        String name = sc.nextLine();
        System.out.println("Ten cua ban la: " + name);
        System.out.println("Hay nhap tuoi cua ban: ");
        int age = sc.nextInt();
        System.out.println("Tuoi cua ban la: "+ age);
        System.out.println("Hay nhap chieu cao cua ban: ");
        float height = sc.nextFloat();
        System.out.println("Chieu cao cua ban la: "+ height);
        System.out.println("Thong tin cua ban la: " + name + "\n" + age + "\n" + height);
    }

}
