package tests;

import model.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ZooKeeperTests {

    Zookeeper testZK= new Zookeeper("Prashant Nigam",19);

        Elephant HathiMeraSathi = new Elephant("Kishore","India",35,
                testZK,474.40);
        Horse meraChetak = new Horse("Chetak","India",29,testZK,
                275.09,120);
        Snake Naagin = new Snake("Kobra",3,"India",13,
                testZK,12,false);
        Whale Hsss = new Whale("Gothi's Whale",14,"India",1500,
                testZK,false);



    @Test
    public void testZooKeeper(){
        testZK.addAnimal(HathiMeraSathi);
        testZK.addAnimal(meraChetak);
        testZK.addAnimal(Naagin);
        testZK.addAnimal(Hsss);
        testZK.setFavourite(meraChetak);

        assertTrue(testZK.getName().equals("Prashant Nigam"));
        assertFalse(testZK.getAge()==0);
        assertTrue(testZK.getFavourite().getCareTaker().equals(testZK));
        assertTrue(testZK.getAnimalList().size()==4);
        testZK.removeAnimal(HathiMeraSathi);
        assertTrue(testZK.getAnimalList().size()==3);
        testZK.clearAnimalList();
        assertTrue(testZK.getAnimalList().size()==0);
    }
}
