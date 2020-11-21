package Decorator;

public class RunDecorator extends EquipmentsDecorator{
    public RunDecorator(Animals abilityA){
        super(abilityA);
    }
    public void ability(){
        abilityA.ability();

    }
    public void setAbility(int type){
        String typeOfAnimal,typeOfEquipment;
        typeOfEquipment="神奇跑鞋";
        if(type==1){
            typeOfAnimal="狗";
            System.out.println("你为" + typeOfAnimal + "穿上了"+typeOfEquipment + "因此他能够跑得更快\n");
        }
        else{
            typeOfAnimal="鸟";
            System.out.println("你为" + typeOfAnimal + "穿上了"+typeOfEquipment + "因此他能够跑\n");
        }
    }
}
