package FactoryMethod;

public class SubmersibleFactory implements IFactory {
    @Override
    public Equipment createEquipment() {
        return new Submersible();
    }
}
