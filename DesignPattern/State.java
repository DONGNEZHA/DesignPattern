package DesignPattern;

import State.*;

public class State {
    public static void main(String[] args){
        StateContext stateContext = new StateContext();

        stateContext.setAnimalState(new StatePerfect());
        stateContext.drinkCoffee();
        stateContext.attendGame();
        stateContext.attendGame();
        stateContext.attendGame();
        stateContext.drinkCoffee();
        stateContext.drinkCoffee();
        System.out.println(stateContext.getState());
    }
}
