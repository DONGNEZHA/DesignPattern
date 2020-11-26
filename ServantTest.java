package Test;

import ServantDesignPattern.Cleaner;
import ServantDesignPattern.Lawn;
import ServantDesignPattern.Runway;

public class ServantTest {
    public static void main(String[] args){
        Cleaner cleaner = new Cleaner();
        cleaner.clean(new Runway());
        cleaner.clean(new Lawn());
    }

}
