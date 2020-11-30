package Filter;

import SimpleFactory.Athlete;

import java.util.ArrayList;

public class DogCriteria implements Criteria {
    //该标准判断对象种族是否为狗
    @Override
    public ArrayList<Athlete> meetCriteria(ArrayList<Athlete> athleteList) {
        ArrayList<Athlete> dogAnimals = new ArrayList<>();
        for (Athlete animal : athleteList) {
            if (animal.getAnimalRace().getRace() == "Dog") {
                dogAnimals.add(animal);
            }
        }
        return dogAnimals;
    }
}
