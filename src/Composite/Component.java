package Composite;

public abstract class Component {

    public Object option;

    public abstract String getName();

    public void add(Component component) {
        System.out.println("");
    }

    public abstract Menu getLast();

    public void printMenu() {
        System.out.println("");
    }

    public void setLastMenu(Menu lastMenu){
        System.out.println("");
    };
}


