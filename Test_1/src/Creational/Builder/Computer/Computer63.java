package Creational.Builder.Computer;
//1.lop can tao doi tuong, viec tao doi tuong gom nhieu thanh phan thong qua nhieu buoc
public class Computer63 {
    //2. Xac dinh cac thanh phan phuc tap can phai tao thong qua cac buoc
    String CPU, Ram, storage, screen;
    //3. Viet lop builder
    //4. Viet ham khoi tao
    public static class  Builder{
        String CPU, Ram, storage, screen;
        //6. Cac phuong thuc de xay dung thanh phan
        public Builder buildCPU(String cpu){
            this.CPU = cpu;
            return this;
        }

        public String getCPU() {
            return CPU;
        }

        public void setCPU(String CPU) {
            this.CPU = CPU;
        }

        public String getRam() {
            return Ram;
        }

        public void setRam(String ram) {
            Ram = ram;
        }

        public String getStorage() {
            return storage;
        }

        public void setStorage(String storage) {
            this.storage = storage;
        }

        public String getScreen() {
            return screen;
        }

        public void setScreen(String screen) {
            this.screen = screen;
        }

        public Builder buildRam(String ram){
            this.Ram = ram;
            return this;
        }
        public Builder buildStorage(String storages){
            this.storage = storages;
            return this;
        }
        public Builder buildScreen(String screens){
            this.screen = screens;
            return this;
        }
        //5. Phuong thuc build tra ve doi tuong cac khoi tao
        public Computer63 build(){
            return new Computer63(this);
        }
    }

    @Override
    public String toString() {
        return "Thong so Computer la: " + "\n" +
                "CPU: " + CPU + "\n" +
                "Ram: " + Ram + "\n" +
                "Storage: " + storage + "\n" +
                "Screen: " + screen;
    }

    private Computer63(Builder b) {
        CPU = b.CPU;
        Ram = b.Ram;
        storage = b.storage;
        screen = b.screen;

    }
}
