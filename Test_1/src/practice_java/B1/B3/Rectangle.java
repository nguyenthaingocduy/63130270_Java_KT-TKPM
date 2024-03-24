package practice_java.B1.B3;

public class Rectangle {
    private double width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

   public double getArea() {
        return width * height;
    }
    public double getParameter(){
        return (height +width) * 2;
    }
}
