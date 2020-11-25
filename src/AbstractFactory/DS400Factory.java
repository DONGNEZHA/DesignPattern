package AbstractFactory;

public class DS400Factory implements JudgeIngredientFactory {
    @Override
    public Race CreateRace() {
        return new Dragonfly();
    }

    @Override
    public GameType CreateType() {
        return new FourHundredMetersSwimming();
    }
}
