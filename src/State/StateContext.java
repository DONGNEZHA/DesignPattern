package State;

public class StateContext {
    public final static AnimalState state1 = new StatePerfect();
    public final static AnimalState state2 = new StateGood();
    public final static AnimalState state3 = new StateTired();

    private AnimalState animalState;

    public AnimalState getAnimalState() {
        return animalState;
    }

    public void setAnimalState(AnimalState animalState) {
        this.animalState = animalState;

        this.animalState.setContext(this);
    }

    public void drinkCoffee() {
        this.animalState.drinkCoffee();
    }

    public void attendGame() {
        this.animalState.attendGame();
    }

    public double getState() {
        return this.animalState.getState();
    }

}
