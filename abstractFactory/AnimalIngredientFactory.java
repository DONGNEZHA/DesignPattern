package abstractFactory;

public interface AnimalIngredientFactory {

    public abstract Race CreateRace();   // Race product
    public abstract Color CreateColor();   // Color product


}
