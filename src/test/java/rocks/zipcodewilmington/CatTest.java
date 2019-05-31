package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void testSetName() {
        Cat cat = new Cat(" ",new Date(),0);
       cat.setName("Zula");
        Assert.assertEquals("Zula", cat.getName());
    }
    @Test
    public void testSetBirthDate() {
        Cat cat = new Cat("Zula ",new Date(),0);
        cat.setBirthDate(new Date());
        Assert.assertEquals(new Date(), cat.getBirthDate());
    }
    @Test
    public void testspeak(){
        Cat cat = new Cat("Zula ",new Date(),0);
        Assert.assertEquals("meow!", cat.speak());
    }
    @Test
    public void testeat(){
        Cat cat = new Cat("Zula ",new Date(),0);
        Food milk=new Food();
        cat.eat(milk);
      int i= cat.getNumberOfMealsEaten();

       Assert.assertEquals(1,i);
    }
    @Test
    public void testgetID(){
        Cat cat = new Cat("Zula ",new Date(),0);
        int id=cat.getId();
       Assert.assertEquals(0,id);
    }

   @Test
    public void testInstance(){
        Cat cat = new Cat("Zula ",new Date(),0);
       Assert.assertEquals(true,cat instanceof Animal);
    }

    @Test
    public void testInstancem(){
        Cat cat = new Cat("Zula ",new Date(),0);
        Assert.assertEquals(true,cat instanceof Mammal);
    }
}
