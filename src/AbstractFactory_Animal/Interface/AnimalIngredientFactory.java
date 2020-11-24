package AbstractFactory_Animal.Interface;

public interface AnimalIngredientFactory {

    public abstract Race CreateRace();   // Race product
    public abstract Color CreateColor();   // Color product


}
