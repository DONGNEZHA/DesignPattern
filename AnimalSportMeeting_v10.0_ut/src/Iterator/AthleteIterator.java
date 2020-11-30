package Iterator;

import SimpleFactory.Athlete;

public class AthleteIterator implements Iterator {
    //运动员的迭代器类
    private AthleteContainer athleteContainer;
    private int index;

    // 将操作对象容器传入
    public AthleteIterator(AthleteContainer athleteContainer) {
        this.athleteContainer = athleteContainer;
        this.index = 0;
    }

    //判断是否有下一个对象存在
    @Override
    public boolean hasNext() {
        return index < athleteContainer.size();
    }

    //指针后移
    @Override
    public Object next() {
        Athlete athlete = athleteContainer.get(index);
        index++;
        return athlete;
    }
}
