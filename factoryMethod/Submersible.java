package factoryMethod;

public class Submersible extends Equipment{
    //潜水器，功能可以潜水
    @Override
    public void function() {
        System.out.println("get a submersible");
        System.out.println("now you can join swim game");
    }
}
