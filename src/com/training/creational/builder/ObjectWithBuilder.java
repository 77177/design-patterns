package com.training.creational.builder;

public class ObjectWithBuilder {

    private int aa;
    private int bb;
    private int cc;
    private int dd;
    private int ee;

    private ObjectWithBuilder(){

    }

    private ObjectWithBuilder(int aa, int bb, int cc, int dd, int ee) {
        this.aa = aa;
        this.bb = bb;
        this.cc = cc;
        this.dd = dd;
        this.ee = ee;
    }

    public ObjectWithBuilder(Builder builder) {
        this.aa = builder.a;
        this.bb = builder.b;
        this.cc = builder.c;
        this.dd = builder.d;
        this.ee = builder.e;
    }

    public static class Builder{

        private int a;
        private int b;
        private int c;
        private int d;
        private int e;

        public Builder setA(int a) {
            this.a = a;
            return this;
        }

        public Builder setB(int b) {
            this.b = b;
            return this;
        }

        public Builder setC(int c) {
            this.c = c;
            return this;
        }

        public Builder setD(int d) {
            this.d = d;
            return this;
        }

        public Builder setE(int e) {
            this.e = e;
            return this;
        }

        public ObjectWithBuilder build(){
            return new ObjectWithBuilder(this);
        }
    }


    @Override
    public String toString() {
        return "IntermediateDecorator{" +
                "a=" + aa +
                ", b=" + bb +
                ", c=" + cc +
                ", d=" + dd +
                ", e=" + ee +
                '}';
    }
}
