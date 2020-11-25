package AniamlGames.MVC.Animal;

public class Animal {
    String AnimalName;
    Race AnimalRace;
    Color AnimalColor;
    int speed,power,skill,HP=5;

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
        if (AnimalRace.toString().equals("cat")){
            skill+=3;
        }
        else if (AnimalRace.toString().equals("dog")){
            HP+=5;
        }
        if (AnimalColor.toString().equals("green")){
            speed+=2;
        }
        else if (AnimalColor.toString().equals("red")){
            power+=4;
        }

        System.out.println("Preparing "+AnimalColor.toString()+'_'+AnimalRace.toString());
    }
    public void setAnimalName(String animalName) {
        this.AnimalName = animalName;
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

    public int getHP() {
        return HP;
    }

    public int getPower() {
        return power;
    }

    public int getSkill() {
        return skill;
    }

    public int getSpeed() {
        return speed;
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
