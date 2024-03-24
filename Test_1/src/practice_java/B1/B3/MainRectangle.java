package practice_java.B1.B3;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10,15);
        Rectangle rectangle2 = new Rectangle(5,10);
        Rectangle rectangle3 = new Rectangle(5,5);
        System.out.println("This is area of rectangle: "+rectangle3.getArea());
        System.out.println("This is parameter of rectangle: "+rectangle3.getParameter());
        //-------------------------------------------------------------------------------
        System.out.println("This is area of rectangle: "+rectangle1.getArea());
        System.out.println("This is parameter of rectangle: "+rectangle1.getParameter());
        //-------------------------------------------------------------------------------
        rectangle3.setHeight(6);
        rectangle3.setWidth(7);

        //After changed
        System.out.println("This is area of rectangle: "+rectangle3.getArea());
        System.out.println("This is parameter of rectangle: "+rectangle3.getParameter());



    }
}
