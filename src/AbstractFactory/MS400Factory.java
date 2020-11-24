package AbstractFactory;

public class MS400Factory implements JudgeIngredientFactory {
    @Override
    public Race CreateRace() {
        return new Monkey();
    }

    @Override
    public GameType CreateType() {
        return new FourHundredMetersSwimming();
    }
}
