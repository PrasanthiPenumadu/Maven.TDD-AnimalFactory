package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;


import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Mimi";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }
    @Test
    public void testAdd(){
        CatHouse.clear();
        Cat alli = AnimalFactory.createCat("Mimi",new Date());
        CatHouse ct=new CatHouse();
        ct.add(alli);
        int j=ct.getNumberOfCats();
        Assert.assertEquals(1,j);
    }
    @Test
    public void testRemoveid()
    {
        CatHouse.clear();
        Cat Cat2 = AnimalFactory.createCat("Mimi",new Date());
        CatHouse ct=new CatHouse();
        ct.add(Cat2);
        Integer id=0;
        ct.remove(id);
        int j=ct.getNumberOfCats();

        Assert.assertEquals(0,j);
    }

    @Test
    public void testRemove()
    {   CatHouse.clear();
        Cat Cat2 = AnimalFactory.createCat("Mimi",new Date());
        CatHouse ct=new CatHouse();
        ct.add(Cat2);
        ct.remove(Cat2);
        int j=ct.getNumberOfCats();
        Assert.assertEquals(0,j);
    }

    @Test
    public void testCatdbyid(){
        CatHouse.clear();
        Cat Cat3 = AnimalFactory.createCat("Mimi",new Date());
        CatHouse ct=new CatHouse();
        ct.add(Cat3);
        int id=0;
        Cat d3=ct.getCatById(id);
        Assert.assertEquals(Cat3,d3);
    }
    @Test
    public void testgetNumberOfCats(){
        CatHouse.clear();
        Cat Cat3 = AnimalFactory.createCat("Mimi",new Date());
        CatHouse ct=new CatHouse();
        ct.add(Cat3);
        int j=ct.getNumberOfCats();
        Assert.assertEquals(1,j);
    }

}

