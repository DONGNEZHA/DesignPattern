package iterator;

public class Test {
    public static void main(String[] args) {
        Dog a=new Dog("小狗1");
        Dog b=new Dog("小狗2");
        Cat c=new Cat("小猫1");

        AnimalsContainer animals=new AnimalsContainer();
        animals.add(a);
        animals.add(b);
        animals.add(c);

        Game aa=new RunningGame();
        Game bb=new JumpGame();

        GameContainer games=new GameContainer();
        games.add(aa);
        games.add(bb);

        AnimalsIterator it= (AnimalsIterator) animals.iterator();

        System.out.println("Testing Animal's Iterator：");
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        GameIterator itt = (GameIterator) games.iterator();

        System.out.println("\nTesting Game's Iterator：");
        while(itt.hasNext()){
            System.out.println(itt.next());
        }
    }
}
