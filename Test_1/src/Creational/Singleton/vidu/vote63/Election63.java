package Creational.Singleton.vidu.vote63;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Election63 {
    private static Election63 instance;
    private int biden = 0, trump = 0;
    List<String> users = new ArrayList<>();
    public static Election63 getInstance(){
        if(instance==null)
            instance = new Election63();

        return instance;
    }
    private boolean isVoted(){
        return false;
    }
    protected Election63(){

    }
    public void vote(Candidate c, String user) {
        if (!isVoted()) {
            if (c == Candidate.DONAL_TRUMP)
                trump++;
            else if (c == Candidate.JOE_BIDEN)
                biden++;
            users.add(user);
        }
    }
    public  void inKQ(){
        System.out.println("Donal Trump: "+ trump);
        System.out.println("Joe Biden: "+ biden);
    }

}
