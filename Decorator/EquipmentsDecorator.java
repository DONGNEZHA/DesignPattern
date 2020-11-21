package Decorator;

public abstract class EquipmentsDecorator implements Animals {
    Animals abilityA;
    public EquipmentsDecorator(Animals abilityA){
        this.abilityA=abilityA;
    }
    public void ability(){
        abilityA.ability();
    }

}
