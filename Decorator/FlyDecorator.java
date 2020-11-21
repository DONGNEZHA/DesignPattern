package Decorator;

public class FlyDecorator extends EquipmentsDecorator{
    public FlyDecorator(Animals abilityA){
        super(abilityA);
    }
    public void ability(){
        abilityA.ability();

    }
    public void setAbility(int type){
        String typeOfAnimal,typeOfEquipment;
        typeOfEquipment="神奇翅膀";
        if(type==1){
            typeOfAnimal="狗";
            System.out.println("你为" + typeOfAnimal + "穿上了"+typeOfEquipment + "因此他能够飞\n");
        }
        else{
            typeOfAnimal="鸟";
            System.out.println("你为" + typeOfAnimal + "穿上了"+typeOfEquipment + "因此他能够飞得更快\n");
        }
    }
}
