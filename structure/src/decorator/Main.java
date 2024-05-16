package decorator;

public class Main {
    public static void main(String[] args) {
        String s = "Sinh viên và giáo viên được nghỉ lễ 5 ngày!";
        Tokenize t = new TachTu(s);
        System.out.println(t.tokenize());
        t = new RemoveStopWord(t);
        System.out.println(t.tokenize());
        t = new RemovePunctuation(t);
        System.out.println(t.tokenize());
    }
}
