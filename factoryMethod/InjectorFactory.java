package factoryMethod;

public class InjectorFactory implements IFactory{
    @Override
    public Equipment createEquipment() {
        return new Injector();
    }
}