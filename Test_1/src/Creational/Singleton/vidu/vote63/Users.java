package Creational.Singleton.vidu.vote63;

public class Users {


    String name;
    public Users(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + "Name: " + name;
    }

    public void vote(Candidate c){
        Election63.getInstance().vote(c,name);
    }
}
