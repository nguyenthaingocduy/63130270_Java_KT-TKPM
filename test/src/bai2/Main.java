package bai2;

import java.sql.SQLOutput;

public class Main {
    public static  void main(String[] args){
        Dog dog1 = new Dog("Dat", "Husky");
        Dog dog2 = new Dog("Vu", "Corgi");

        System.out.println(dog1.getName()+ "is a" + dog1.getBreed()+".");
        System.out.println(dog2.getName()+"is a" + dog2.getBreed()+ ".");
//after set name and breed
        dog1.setName("Tuyet");
        dog2.setBreed("Grass");
        System.out.println(dog1.getName() + "is a"+ dog1.getBreed()+".");
        System.out.println(dog2.getName() + "is a"+ dog2.getBreed()+".");
    }
}
