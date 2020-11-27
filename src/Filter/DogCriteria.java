package Filter;

import SimpleFactory.Athlete;

import java.util.ArrayList;

public class DogCriteria implements Criteria {

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
