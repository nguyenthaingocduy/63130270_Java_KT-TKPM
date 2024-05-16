package bai3;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Chieu cao va chieu rong hinh chu nhat: " + height + "\t" + "\n" + width;

    }
    public double getArea(){
        return width * height;
    }
    public double getParameter(){
        return (width + height) * 2;
    }
}
