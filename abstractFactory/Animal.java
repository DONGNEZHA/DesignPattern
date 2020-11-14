package abstractFactory;

public class Animal {
    String AnimalName;
    Race AnimalRace;
    Color AnimalColor;

    AnimalIngredientFactory factory;// factory interface

    public Animal(){// do nothing

    }

    public void setFactory(AnimalIngredientFactory factory) {//bind product factory
        this.factory = factory;
    }

    public void makeAnimal(){

        prepare();
        setAnimalName(AnimalColor.toString()+AnimalRace.toString());
        //default use color&race

    }

    private void    prepare(){// bind Animal attribute
        AnimalRace=factory.CreateRace();
        AnimalColor=factory.CreateColor();
        System.out.println("Preparing "+AnimalColor.toString()+'_'+AnimalRace.toString());
    }
    private void setAnimalName(String animalName) {
        AnimalName = animalName;
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

    @Override
    public String toString() {// to print test

        StringBuffer result=new StringBuffer();
        result.append("----"+AnimalName+"----\n");
        if (AnimalColor!=null){

            result.append("color is ");
            result.append(AnimalColor);

        }
        result.append(" ");
        if (AnimalRace!=null){
            result.append("race is ");
            result.append(AnimalRace);
        }
        return result.toString();
    }
}
