package model;

public class Snake extends Animal {

    private double length;
    private boolean venom;

    public Snake(String nm, int age, String ct, double wgt, Zookeeper zk, double len, boolean vn) {
        super(nm,age,ct,wgt,zk);
        length = len;
        venom = vn;
    }

    // getters
    public double getLength() { return length; }
    public boolean isVenom() { return venom; }

}