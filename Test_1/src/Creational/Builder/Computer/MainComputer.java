package Creational.Builder.Computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer63 computer63 = new Computer63.Builder()
                .buildCPU("Intel 1500 ultra 19")
                .buildRam("64GB samsung")
                .buildStorage("4TB NVne samsung")
                .buildScreen("17 inches 16")
                .build();
        System.out.println(computer63.toString());

    }
}
