package factoryMethod;

public class Main {
    public static void main(String[] args) {
        IFactory factory_1=new SubmersibleFactory();
        Equipment equipment_1=factory_1.createEquipment();
        equipment_1.function();


        IFactory factory_2=new InjectorFactory();
        Equipment equipment_2=factory_2.createEquipment();
        equipment_2.function();

    }
}