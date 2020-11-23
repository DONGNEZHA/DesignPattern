package Observer;

import java.util.ArrayList;
/**
 * 运动会实现主题，发布排名信息
 */
public class AnimalGames implements Subject{
    private ArrayList observers;
    private int ranking;

    public AnimalGames() {
        // 加个ArrayList存放所有注册的Observer对象;
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        // 当新的观察者注册时添加进来
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        // 当观察者取消注册时去除该观察者
        int i = observers.indexOf(o);
        if (i>=0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        // 更新状态，调用Observer的update告诉观察者有新的信息
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(ranking);
        }
    }

    /*
     *  此方法用于AnimalGames收到的数据,并且调用更新使数据实时通知给观察者
     */
    public void setRankings(int ranking){
        this.ranking = ranking;
        System.out.println("运动员排名为：" + ranking );
        notifyObserver();
    }
}
