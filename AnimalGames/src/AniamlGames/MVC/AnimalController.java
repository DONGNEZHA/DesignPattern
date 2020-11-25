package AniamlGames.MVC;

import AniamlGames.MVC.Animal.Animal;

public class AnimalController {
    private Animal model;
    private AnimalViews view;

    public AnimalController(Animal model,AnimalViews view) {
        this.model = model;
        this.view = view;
    }

    public void setAnimalName(String name){
        model.setAnimalName(name);
    }

    public String getAnimalName(){
        return model.getAnimalName();
    }

    public void updateView(){
        view.printAnimalDetails(model.getAnimalName());
    }
}
