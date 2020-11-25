package AbstractFactory;

public class DR100Factory implements JudgeIngredientFactory {
    @Override
    public Race CreateRace() {
        return new Dragonfly();
    }

    @Override
    public GameType CreateType() {
        return new OneHundredMetersRunning();
    }
}
