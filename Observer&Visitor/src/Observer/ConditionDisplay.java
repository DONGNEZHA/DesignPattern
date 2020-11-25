package Observer;

import java.util.ArrayList;
import java.util.List;

public class ConditionDisplay implements Subject{
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
    public void notifyObserver(int rank[]) {
        for(Observer observer:OBList){
            observer.update(rank);
        }
    }
}
