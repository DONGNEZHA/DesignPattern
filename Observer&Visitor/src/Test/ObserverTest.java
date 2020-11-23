package Test;

import Observer.AnimalGames;
import Observer.ConditionDisplay;

public class ObserverTest {
    public static void main(String[] args) {
        // 首先创建一个主题/被观察者
        AnimalGames animalGames = new AnimalGames();
        // 创建观察者并将被观察者对象传入
        ConditionDisplay conditionDisplay = new ConditionDisplay(animalGames);

        //设置AnimalGames模拟收到的排名数据
        animalGames.setRankings(6);
        animalGames.setRankings(3);
        animalGames.setRankings(1);
    }
}
