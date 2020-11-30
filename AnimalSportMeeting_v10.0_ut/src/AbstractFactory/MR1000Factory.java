package AbstractFactory;

public class MR1000Factory implements JudgeIngredientFactory {
    //1000m跑、猴子
    @Override
    public Race CreateRace() {
        return new Monkey();
    }

    @Override
    public GameType CreateType() {
        return new OneHundredMetersRunning();
    }
}
