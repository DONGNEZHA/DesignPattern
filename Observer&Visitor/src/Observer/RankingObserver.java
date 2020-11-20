package Observer;


public class RankingObserver {

    public static void main(String[] args) {
        // 首先创建一个主题/被观察者
        AnimalGames animalGames = new AnimalGames();
        // 创建观察者并将被观察者对象传入
        ConditionDisplay conditionDisplay = new ConditionDisplay(animalGames);


        animalGames.setRankings(6);
        animalGames.setRankings(3);
        animalGames.setRankings(1);
    }
}