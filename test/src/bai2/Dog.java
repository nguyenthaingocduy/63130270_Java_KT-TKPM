package bai2;

public class Dog {
    public  String Name;
    public  String Breed;

    public Dog(String name, String breed) {
        Name = name;
        Breed = breed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    @Override
    public String toString() {
        return "dog Name: " + Name + "\n" + "dog Breed: " + Breed;
    }
}
