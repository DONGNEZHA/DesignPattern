package Test;


import Observer.AnimalGames;
import Observer.ConditionDisplay;

public class ObserverTest {
    public static void main(String[] args) {
        int rank[]=new int[]{2,1,3,6,5,4};//存储运动员排名信息，索引位代表运动员编号，存储的信息代表排名

        ConditionDisplay CD=new ConditionDisplay();
        AnimalGames zero = new AnimalGames(0);
        AnimalGames one = new AnimalGames(1);
        AnimalGames two = new AnimalGames(2);
        AnimalGames three = new AnimalGames(3);
        AnimalGames four = new AnimalGames(4);
        AnimalGames five = new AnimalGames(5);

        CD.registerObserver(zero);
        CD.registerObserver(one);
        CD.registerObserver(two);
        CD.registerObserver(three);
        CD.registerObserver(four);
        CD.registerObserver(five);

        CD.notifyObserver(rank);

    }
}
