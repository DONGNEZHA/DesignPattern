package AbstractFactory;

public class DS400Factory implements JudgeIngredientFactory {
    //400m游泳、蜻蜓
    @Override
    public Race CreateRace() {
        return new Dragonfly();
    }

    @Override
    public GameType CreateType() {
        return new FourHundredMetersSwimming();
    }
}
