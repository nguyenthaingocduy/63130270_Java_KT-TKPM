package bai3;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5 );
        Rectangle r2 = new Rectangle(2, 10);
        System.out.println("Dien tich va chu vi hinh chu nhat la: " + r1.getArea() + "\t" + r1.getParameter());
        System.out.println("Dien tich va chu vi hinh chu nhat 2 la: " + r2.getArea() + "\t" + r2.getParameter());

        r1.setHeight(20);
        r2.setWidth(10);
        System.out.println("After when set");
        System.out.println("Dien tich va chu vi hinh chu nhat la: " + r1.getArea() + "\t" + r1.getParameter());
        System.out.println("Dien tich va chu vi hinh chu nhat 2 la: " + r2.getArea() + "\t" + r2.getParameter());
    }
}
