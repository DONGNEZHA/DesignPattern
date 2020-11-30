package SimpleFactory;

import State.StateGood;

public class AthleteFactory {
    //创建并初始化运动员
    public Athlete createAthlete(String race, String color) {
        AthleteIngredientFactory athleteIngredientFactory = new AthleteIngredientFactory();
        Athlete athlete = new Athlete();
        athlete.setAnimalRace(athleteIngredientFactory.setRace(race));
        athlete.setAnimalColor(athleteIngredientFactory.setColor(color));
        athlete.setAnimalName(color + race);
        if (athlete.getAnimalRace().getRace() == "Cat") {
            athlete.setSpeed(106);
            athlete.setPhysical(96);
            athlete.setStrength(94);
            athlete.setSkill(104);
        } else if (athlete.getAnimalRace().getRace() == "Dog") {
            athlete.setSpeed(103);
            athlete.setPhysical(99);
            athlete.setStrength(100);
            athlete.setSkill(101);
        } else if (athlete.getAnimalRace().getRace() == "Bear") {
            athlete.setSpeed(98);
            athlete.setPhysical(104);
            athlete.setStrength(99);
            athlete.setSkill(108);
        }
        athlete.setRank(new int[]{0, 0, 0});
        athlete.setScore(new double[]{0, 0, 0});
        athlete.setAnimalState(new StateGood());
        return athlete;
    }

}
