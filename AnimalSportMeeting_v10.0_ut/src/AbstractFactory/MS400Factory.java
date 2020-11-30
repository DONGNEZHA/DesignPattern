package AbstractFactory;

public class MS400Factory implements JudgeIngredientFactory {
    //400m游泳、猴子
    @Override
    public Race CreateRace() {
        return new Monkey();
    }

    @Override
    public GameType CreateType() {
        return new FourHundredMetersSwimming();
    }
}
