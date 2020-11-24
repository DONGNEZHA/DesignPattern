package SimpleFactory;

public class AthleteFactory {
    public Athlete createAthlete(String race, String color) {
        AthleteIngredientFactory athleteIngredientFactory = new AthleteIngredientFactory();
        Athlete athlete = new Athlete();
        athlete.setAnimalRace(athleteIngredientFactory.setRace(race));
        athlete.setAnimalColor(athleteIngredientFactory.setColor(color));
        athlete.setAnimalName(color + race);
        if (race == "Dragonfly") {
            athlete.setSpeed(106);
            athlete.setPhysical(96);
            athlete.setStrength(94);
            athlete.setSkill(104);
        } else if (race == "Monkey") {
            athlete.setSpeed(103);
            athlete.setPhysical(99);
            athlete.setStrength(100);
            athlete.setSkill(101);
        } else if (race == "Bear") {
            athlete.setSpeed(98);
            athlete.setPhysical(104);
            athlete.setStrength(99);
            athlete.setSkill(108);
        }
        return athlete;
    }

}
