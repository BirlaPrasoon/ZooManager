package model;


import java.util.ArrayList;
import java.util.List;

public class Zookeeper {

    private String name;
    private int age;
    private ArrayList<Animal> animalList;
    private Animal favourite;

    public Zookeeper(String nm, int age){
        this.name = nm;
        this.age = age;
        animalList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }
    public void addAnimal(Animal animal){
        animalList.add(animal);
    }

    public void removeAnimal(Animal animal){
        animalList.remove(animal);
    }

    public void clearAnimalList(){
        animalList.clear();
    }

    public void setFavourite(Animal favourite) {
        this.favourite = favourite;
    }

    public Animal getFavourite() {
        return favourite;
    }

    public void printAnimalList(){
        for(Animal a:animalList){
            System.out.println("Name: " + a.getName() + "  age: " + a.getAge() + " from: " + a.getCountry());
        }
    }
    public ArrayList<Animal> getAnimalList(){
        return animalList;
    }
}