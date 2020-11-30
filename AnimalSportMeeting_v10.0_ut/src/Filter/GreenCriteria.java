package Filter;

import SimpleFactory.Athlete;

import java.util.ArrayList;

public class GreenCriteria implements Criteria {
    //该标准判断对象颜色是否为绿色
    @Override
    public ArrayList<Athlete> meetCriteria(ArrayList<Athlete> athleteList) {
        ArrayList<Athlete> greenAnimals = new ArrayList<>();

        for (Athlete animal : athleteList) {
            if (animal.getAnimalColor().getColor() == "Green") {
                greenAnimals.add(animal);
            }
        }
        return greenAnimals;
    }
}
