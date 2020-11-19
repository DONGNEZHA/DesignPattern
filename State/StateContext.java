package State;

public class StateContext {
    //���嶯���˶�Ա������״̬
    public final static AnimalState state1 = new StatePerfect();
    public final static AnimalState state2 = new StateGood();
    public final static AnimalState state3 = new StateTired();

    //���嵱ǰ�����˶�Ա��״̬
    private AnimalState animalState;

    public AnimalState getAnimalState(){
        return animalState;
    }

    public void setAnimalState(AnimalState animalState){
        this.animalState = animalState;

        //֪ͨ��������ʾ����
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
