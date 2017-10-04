package model;

public class Whale extends Animal {

    private boolean waterType;

    public Whale(String nm, int age, String ct, double wgt, Zookeeper zk, boolean typ) {
        super(nm,age,ct,wgt,zk);
        waterType = typ;
    }

    // getters
    public boolean isWaterType() { return waterType; }

}