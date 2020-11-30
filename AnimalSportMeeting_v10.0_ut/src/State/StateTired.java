package State;

public class StateTired extends AnimalState {
    @Override
    public void drinkCoffee() {
        super.stateContext.setAnimalState(new StateGood());
    }

    @Override
    public void attendGame() {
    }

    @Override
    public double getState() {
        return 0.9;
    }

    @Override
    public String toString() {
        return "StateTired";
    }
}
