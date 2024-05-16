package StringBuilder;

import java.util.stream.IntStream;

public class MyStringBuilder {
    private String str;

    public MyStringBuilder(Builder builder) {
        this.str = builder.str;
    }

    @Override
    public String toString() {
        return str;
    }
    public static class Builder{
        public String str = "";
        public Builder addString(String s){
            this.str += s+ " ";
            return this;
        }
        public Builder addFloat(Float s){
            this.str += s + " ";
            return this;
        }
        public Builder addBool(Boolean s){
            this.str += s + " ";
            return this;
        }
        public MyStringBuilder build(){
            return new MyStringBuilder(this);
        }
    }


}





