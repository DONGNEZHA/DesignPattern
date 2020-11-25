package Observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreSubject implements Subject {
    //单例模式
    private static ScoreSubject instance = new ScoreSubject();
    private ScoreSubject() { }
    public static ScoreSubject getInstance() {
        return instance;
    }

    private List<Observer> OBList = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        OBList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        OBList.remove(observer);
    }

    @Override
    public void notifyObserver(int game, int[] rank, double[] Score) {
        int i = 0;
        for (Observer observer : OBList) {
            observer.update(game, rank[i], Score[i]);
            ++i;
        }
    }
}
