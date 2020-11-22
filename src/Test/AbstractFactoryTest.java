package Test;

import abstractFactory.Animal;
import abstractFactory.AnimalStore;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AnimalStore animalStore=new AnimalStore();
        Animal animal=null;

        animal=animalStore.orderAnimal("GreenDog");
        System.out.println(animal);

        animal=animalStore.orderAnimal("RedDog");
        System.out.println(animal);

        animal=animalStore.orderAnimal("GreenCat");
        System.out.println(animal);

        animal=animalStore.orderAnimal("RedCat");
        System.out.println(animal);

    }
}
