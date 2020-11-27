package MVC;

import SimpleFactory.Athlete;

public class AnimalController {
    private Athlete model;
    private AnimalViews view;

    public AnimalController(Athlete model, AnimalViews views) {
        this.model = model;
        this.view = views;
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
