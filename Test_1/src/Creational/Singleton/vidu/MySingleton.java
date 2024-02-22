package Creational.Singleton.vidu;

import java.sql.SQLOutput;

public class MySingleton {
    //1.Khai bao bien MySingleton
    private static  MySingleton instance;
    //2.Phuong thuc khoi tao private or protected
    int count = 0;
    protected MySingleton(){

    }
    //3.Phuong thuc tinh dung de tra ve bien instance
    public static MySingleton getInstance(){
        if(instance == null)
            instance = new MySingleton();
        return instance;
    }
    public  void inCount(){
        System.out.println(++count);
    }
}
