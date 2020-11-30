package AbstractFactory;

public class DR100Factory implements JudgeIngredientFactory {
    //100m赛跑、蜻蜓
    @Override
    public Race CreateRace() {
        return new Dragonfly();
    }

    @Override
    public GameType CreateType() {
        return new OneHundredMetersRunning();
    }
}
