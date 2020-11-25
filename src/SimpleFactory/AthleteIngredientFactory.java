package SimpleFactory;

public class AthleteIngredientFactory {

    public Race setRace(String raceType) {
        if (raceType == null) {
            return null;
        }
        if (raceType.equalsIgnoreCase("DOG")) {
            return new Dog();
        } else if (raceType.equalsIgnoreCase("CAT")) {
            return new Cat();
        } else if (raceType.equalsIgnoreCase("BEAR")) {
            return new Bear();
        }
        return null;
    }

    public Color setColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (colorType.equalsIgnoreCase("YELLOW")) {
            return new Yellow();
        }
        return null;
    }
}
