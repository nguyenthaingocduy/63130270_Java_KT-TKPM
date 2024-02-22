package Creational.Singleton.vidu.vote63;

public class MainVote63 {
    public static void main(String[] args) {
        Election63 el = new Election63();
        Users u1 = new Users("Di");
        Users u2 = new Users("DiDi");
        Users u3 = new Users("Minh Hung");
        Users u4 = new Users("Ngoc Duy");
        Users u5 = new Users("Duy");
        u1.vote(Candidate.DONAL_TRUMP);
        el.inKQ();

    }
}
