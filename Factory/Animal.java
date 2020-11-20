package Factory;

public class Animal {
    public String AnimalName;
    Race AnimalRace;
    Color AnimalColor;

    public Animal(Race race, Color color){
        AnimalRace = race;
        AnimalColor = color;
    }

    public String getAnimalName() {
        return AnimalName;
    }

    public Color getAnimalColor() {
        return AnimalColor;
    }

    public Race getAnimalRace() {
        return AnimalRace;
    }

    public void showAnimalInfo() {
        System.out.println("Name is " + AnimalName + "!");
        AnimalRace.getRace();
        AnimalColor.getColor();
    }


}
