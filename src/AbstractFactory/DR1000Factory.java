package AbstractFactory;

public class DR1000Factory implements JudgeIngredientFactory {
    @Override
    public Race CreateRace() {
        return new Dragonfly();
    }

    @Override
    public GameType CreateType() {
        return new OneThousandMetersRunning();
    }
}
