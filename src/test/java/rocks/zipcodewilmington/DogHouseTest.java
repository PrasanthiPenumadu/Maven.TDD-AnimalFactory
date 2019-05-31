package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void testAdd(){
        DogHouse.clear();
        Dog axlej = AnimalFactory.createDog("Milo",new Date());
        DogHouse dg=new DogHouse();
        dg.add(axlej);
        int j=dg.getNumberOfDogs();
       Assert.assertEquals(1,j);
    }
    @Test
    public void testRemoveid()
    {
        DogHouse.clear();
        Dog dog2 = AnimalFactory.createDog("Milo",new Date());
        DogHouse dg=new DogHouse();
        dg.add(dog2);
        Integer id=0;
        dg.remove(id);
        int j=dg.getNumberOfDogs();

        Assert.assertEquals(0,j);
    }

    @Test
            public void testRemove()
    {    DogHouse.clear();
        Dog dog2 = AnimalFactory.createDog("Milo",new Date());
        DogHouse dg=new DogHouse();
        dg.add(dog2);
        dg.remove(dog2);
        int j=dg.getNumberOfDogs();
        Assert.assertEquals(0,j);
    }

@Test
    public void testDogdbyid(){
    DogHouse.clear();
  Dog dog3 = AnimalFactory.createDog("Milo",new Date());
   DogHouse dg=new DogHouse();
   dg.add(dog3);
    int id=0;
    Dog d3=dg.getDogById(id);
    Assert.assertEquals(dog3,d3);
}
@Test
    public void testgetNumberOfDogs(){
    DogHouse.clear();
    Dog dog3 = AnimalFactory.createDog("Milo",new Date());
    DogHouse dg=new DogHouse();
    dg.add(dog3);
    int j=dg.getNumberOfDogs();
    Assert.assertEquals(1,j);
}

}
