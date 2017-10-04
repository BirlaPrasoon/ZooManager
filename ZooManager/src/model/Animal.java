package model;

public class Animal {
    protected String name;
    protected String country;
    protected int age;
    protected Zookeeper careTaker;
    protected double weight;

    public Animal(String nm, int age, String ct, double wgt, Zookeeper zk) {
        country = ct;
        this.age = age;
        name = nm;
        weight = wgt;
        careTaker = zk;
    }

    // getters
    public String getName() { return name; }

    public String getCountry() { return country; }

    public int getAge() { return age; }

    public Zookeeper getCareTaker() { return careTaker; }

    public double getWeight() { return weight; }
}
