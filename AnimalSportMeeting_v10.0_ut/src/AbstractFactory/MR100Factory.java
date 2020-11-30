package AbstractFactory;

public class MR100Factory implements JudgeIngredientFactory {
    //100m跑、猴子
    @Override
    public Race CreateRace() {
        return new Monkey();
    }

    @Override
    public GameType CreateType() {
        return new OneHundredMetersRunning();
    }
}
