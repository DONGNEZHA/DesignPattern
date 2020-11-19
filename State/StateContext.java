package State;

public class StateContext {
    //定义动物运动员的所有状态
    public final static AnimalState state1 = new StatePerfect();
    public final static AnimalState state2 = new StateGood();
    public final static AnimalState state3 = new StateTired();

    //定义当前动物运动员的状态
    private AnimalState animalState;

    public AnimalState getAnimalState(){
        return animalState;
    }

    public void setAnimalState(AnimalState animalState){
        this.animalState = animalState;

        //通知到各个显示类中
        this.animalState.setContext(this);
    }

    public void drinkCoffee(){
        this.animalState.drinkCoffee();
    }

    public void attendGame(){
        this.animalState.attendGame();
    }

    public double getState(){
        return this.animalState.getState();
    }

}
