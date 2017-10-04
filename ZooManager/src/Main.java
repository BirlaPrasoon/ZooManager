import model.*;

public class Main {


    public static void main(String[] args) {
        Zookeeper testZK = new Zookeeper("Prashant Nigam", 19);

        Elephant HathiMeraSathi = new Elephant("Kishore", "India", 35,
                testZK, 474.40);
        Horse meraChetak = new Horse("Chetak", "India", 29, testZK,
                275.09, 120);
        Snake Naagin = new Snake("Kobra", 3, "India", 13,
                testZK, 12, false);
        Whale Hsss = new Whale("Gothi's Whale", 14, "India", 1500,
                testZK, false);
        testZK.addAnimal(new Animal("dfsf",23,"India",23.2,new Zookeeper("Prashant Nigam",19)));
        testZK.addAnimal(meraChetak);
        testZK.addAnimal(Naagin);
        testZK.addAnimal(Hsss);
        testZK.setFavourite(meraChetak);
    }}
