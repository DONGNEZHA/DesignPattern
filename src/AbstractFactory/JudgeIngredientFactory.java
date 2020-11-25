package AbstractFactory;

public interface JudgeIngredientFactory {

    public abstract Race CreateRace();   // Race product

    public abstract GameType CreateType();   // GameType product


}
