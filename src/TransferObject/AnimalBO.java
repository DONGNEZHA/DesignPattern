package TransferObject;

import SimpleFactory.Athlete;
import SimpleFactory.AthleteFactory;

import java.util.ArrayList;
import java.util.List;

public class AnimalBO {
    List<Athlete> animals;

    public AnimalBO() {
        animals = new ArrayList<>();
        Athlete animal1 = new AthleteFactory().createAthlete("Cat", "Red");
        Athlete animal2 = new AthleteFactory().createAthlete("Dog", "Green");
        Athlete animal3 = new AthleteFactory().createAthlete("Bear", "Yellow");
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
    }

    public void deleteAnimal(Athlete animal) {
        animals.remove(animal);
        System.out.println(animal.getAnimalName() + "已经离开了!");
    }


    public List<Athlete> getAllAnimals() {
        return animals;
    }

    public Athlete getAnimal(int rollNo) {
        return animals.get(rollNo);
    }

    public void updateAnimal(Athlete animal) {
        animals.add(animal);
        System.out.println(animal.getAnimalName() + ", 加入了运动会!");
    }
}