package State;

public class StateGood extends AnimalState {
    @Override
    public void drinkCoffee() {
        super.stateContext.setAnimalState(new StatePerfect());
    }

    @Override
    public void attendGame() {
        super.stateContext.setAnimalState(new StateTired());
    }

    @Override
    public double getState() {
        return 1.0;
    }

    @Override
    public String toString() {
        return "StateGood";
    }
}
