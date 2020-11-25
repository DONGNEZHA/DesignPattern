package AniamlGames.MVC.Animal;

public class AnimalStore {

    protected Animal createAnimal(String AnimalName){
        Animal animal=new Animal();
        AnimalIngredientFactory factory=null;

        if (AnimalName.equals("GreenDog")){
            factory=new GDFactory();
            animal.setFactory(factory);
        }
        else if (AnimalName.equals("GreenCat")){
            factory=new GCFactory();
            animal.setFactory(factory);
        }
        else if (AnimalName.equals("RedDog")){
            factory=new RDFactory();
            animal.setFactory(factory);
        }
        else if (AnimalName.equals("RedCat")){
            factory=new RCFactory();
            animal.setFactory(factory);
        }


        return animal;
    }

    public Animal orderAnimal(String AnimalName){
        Animal animal=createAnimal(AnimalName);
        animal.makeAnimal();
        return animal;
    }


}
