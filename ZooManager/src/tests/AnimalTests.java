package tests;

import model.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class AnimalTests {

    Animal testAnimal;

    @Before
    public void setUp(){
        testAnimal = new Animal("Kitty",2,"India",3.35,new Zookeeper("Prashant Nigam",19));
    }

    @Test
    public void testGetters(){
        assertTrue(testAnimal.getCountry().equals("India"));
        assertTrue(testAnimal.getName().equals("Kitty"));
        assertTrue(testAnimal.getCareTaker().getName().equals("Prashant Nigam"));
        assertTrue(testAnimal.getWeight()==3.35);
    }

    public void testSubAnimals(){
        Elephant HathiMeraSathi = new Elephant("Kishore","India",35,
                new Zookeeper("Prashant Nigam",19),474.40);
        Horse meraChetak = new Horse("Chetak","India",29,new Zookeeper("Manan Jethu",19),
                275.09,120);
        Snake Naagin = new Snake("Kobra",3,"India",13,
                new Zookeeper("Shrikant Taru",18),12,true);
        Whale Hsss = new Whale("Gothi's Whale",14,"India",1500,
                new Zookeeper("Saurabh Gothi",19),false);
        assertTrue(HathiMeraSathi.getCareTaker().getName().equals("Prashant Nigam"));
        assertTrue(meraChetak.getCountry().equals("India"));
        assertTrue(Naagin.isVenom());
        assertTrue(Hsss.isWaterType()==false);
    }
}
