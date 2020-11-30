package Iterator;

import SimpleFactory.Athlete;

import java.util.ArrayList;

public class AthleteContainer implements Container {
    //运动员容器

    //单例模式，使运动员管理器可以被全局访问
    private static AthleteContainer instance = new AthleteContainer();
    //建立athlete容器
    private ArrayList<Athlete> athletes;

    private AthleteContainer() {
        athletes = new ArrayList<>();
    }

    public static AthleteContainer getInstance() {
        return instance;
    }

    //根据指针返回容器对应的对象
    public Athlete get(int index) {
        return athletes.get(index);
    }

    //在容器末尾增加对象
    public void add(Athlete athlete) {
        athletes.add(athlete);
    }

    //返回容器大小
    public int size() {
        return athletes.size();
    }

    //返回容器对象
    public ArrayList<Athlete> getAthletes() {
        return athletes;
    }

    //生成容器迭代器
    @Override
    public Iterator iterator() {
        return new AthleteIterator(this);
    }
}
