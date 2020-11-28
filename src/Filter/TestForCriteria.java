package Filter;

import SimpleFactory.Athlete;
import SimpleFactory.AthleteFactory;

import java.util.ArrayList;

public class TestForCriteria {

    public static void main(String[] args) {
        AthleteFactory athleteFactory = new AthleteFactory();
        ArrayList<Athlete> athleteList = new ArrayList<Athlete>();
        athleteList.add(athleteFactory.createAthlete("Cat", "Red"));
        athleteList.add(athleteFactory.createAthlete("Cat", "Green"));
        athleteList.add(athleteFactory.createAthlete("Cat", "Yellow"));
        athleteList.add(athleteFactory.createAthlete("Dog", "Red"));
        athleteList.add(athleteFactory.createAthlete("Dog", "Green"));
        athleteList.add(athleteFactory.createAthlete("Bear", "Red"));
        athleteList.add(athleteFactory.createAthlete("Bear", "Yellow"));
        athleteList.add(athleteFactory.createAthlete("Dog", "Yellow"));

        Criteria dogCriteria = new DogCriteria();
        Criteria greenCriteria = new GreenCriteria();

        System.out.println("Before Filtering:");
        for (Athlete athlete : athleteList) {
            System.out.println(athlete.getAnimalColor().getColor() + athlete.getAnimalRace().getRace() + ":" + athlete.getAnimalName());
        }
        AndCriteria andCriteria = new AndCriteria(dogCriteria, greenCriteria);
        ArrayList<Athlete> filterList = andCriteria.meetCriteria(athleteList);

        System.out.println("After Filtering(Green Dog):");
        for (Athlete athlete : filterList) {
            System.out.println(athlete.getAnimalColor().getColor() + athlete.getAnimalRace().getRace() + ":" + athlete.getAnimalName());
        }
    }
}
