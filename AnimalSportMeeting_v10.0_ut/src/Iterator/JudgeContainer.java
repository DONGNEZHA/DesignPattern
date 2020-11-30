package Iterator;

import AbstractFactory.Judge;

import java.util.ArrayList;

public class JudgeContainer implements Container {
    //裁判容器

    //单例模式
    private static JudgeContainer instance = new JudgeContainer();
    //建立judge容器
    private ArrayList<Judge> judges;

    private JudgeContainer() {
        judges = new ArrayList<>();
    }

    public static JudgeContainer getInstance() {
        return instance;
    }

    //根据指针返回容器对应的对象
    public Judge get(int index) {
        return judges.get(index);
    }

    //在容器末尾增加对象
    public void add(Judge judge) {
        judges.add(judge);
    }

    //返回容器大小
    public int size() {
        return judges.size();
    }

    //返回容器对象
    public ArrayList<Judge> getJudges() {
        return judges;
    }

    //生成容器迭代器
    @Override
    public Iterator iterator() {
        return new JudgeIterator(this);
    }
}
