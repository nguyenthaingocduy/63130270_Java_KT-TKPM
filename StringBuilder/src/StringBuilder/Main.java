package StringBuilder;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder.Builder().addString("Hello").addBool(true).addFloat(15f).build();
        System.out.println(myStringBuilder);
    }
}
