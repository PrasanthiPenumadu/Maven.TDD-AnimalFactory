package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;


import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

/*public void tessetName() {
    // Given
    String expected = "cat";

    // When
    AnimalFactoryTest cat = new AnimalFactoryTest(expected);

    // Then
    String actual = cat.setName();
    Assert.assertEquals(expected, actual);
}*/
@Test
public void tsetCreateDog(){
    AnimalFactory af=new AnimalFactory();
    String name="axle";
    Date date=new Date(2018,9,1);
    Dog dog1= af.createDog("axle", new Date(2018,9,1));
   Assert.assertEquals(name,dog1.getName());
    Assert.assertEquals(date,dog1.getBirthDate());
}
    @Test
    public void testCreateCat(){
        AnimalFactory af1=new AnimalFactory();
        String name="mimi";
        Date date=new Date(2018,9,1);
       Cat cat1= af1.createCat("mimi", new Date(2018,9,1));
        Assert.assertEquals(name,cat1.getName());
        Assert.assertEquals(date,cat1.getBirthDate());
    }


}

