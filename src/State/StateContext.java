package State;

public class StateContext {
    private AnimalState animalState;

    public void setAnimalState(AnimalState animalState) {
        this.animalState = animalState;

        this.animalState.setContext(this);
    }

    public double getState() {
        return this.animalState.getState();
    }

}
