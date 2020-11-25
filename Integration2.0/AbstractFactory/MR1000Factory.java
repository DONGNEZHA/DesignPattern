package AbstractFactory;

public class MR1000Factory implements JudgeIngredientFactory {
    @Override
    public Race CreateRace() {
        return new Monkey();
    }

    @Override
    public GameType CreateType() {
        return new OneHundredMetersRunning();
    }
}
