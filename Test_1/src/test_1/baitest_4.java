package test_1;

import java.util.Scanner;


public class baitest_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao ban kinh cua duong tron.");
        double r = sc.nextDouble();
        double chuvi = 2 * Math.PI *r;
        double dientich = Math.PI * Math.pow(r,2);
        System.out.println("Chu vi cua hinh tron la: "+ chuvi);
        System.out.println("Dien tich cua hinh tron la: "+ dientich);
    }
}
