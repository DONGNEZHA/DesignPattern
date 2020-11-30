package AbstractFactory;

public class DR1000Factory implements JudgeIngredientFactory {
    //1000m跑、蜻蜓
    @Override
    public Race CreateRace() {
        return new Dragonfly();
    }

    @Override
    public GameType CreateType() {
        return new OneThousandMetersRunning();
    }
}
