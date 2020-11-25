package factoryMethod;

public class Injector extends Equipment{
    //喷射器，功能可以飞翔
    @Override
    public void function() {
        System.out.println("get a injector");
        System.out.println("now you can join air game");
    }
}
