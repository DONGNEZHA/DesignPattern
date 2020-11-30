package State;

public class StatePerfect extends AnimalState {
    @Override
    public void drinkCoffee() {
    }

    @Override
    public void attendGame() {
        super.stateContext.setAnimalState(new StateGood());
    }

    @Override
    public double getState() {
        return 1.1;
    }

    @Override
    public String toString() {
        return "StatePerfect";
    }
}
