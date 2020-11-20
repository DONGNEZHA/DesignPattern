package Factory;

public class AnimalFactory {

    public Race getRace(String raceType) {
        if (raceType == null) {
            return null;
        }
        if (raceType.equalsIgnoreCase("DOG")) {
            return new Dog();
        } else if (raceType.equalsIgnoreCase("CAT")) {
            return new Cat();
        }
        return null;
    }

    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;
    }
}
