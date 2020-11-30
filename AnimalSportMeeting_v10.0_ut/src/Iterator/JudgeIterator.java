package Iterator;

import AbstractFactory.Judge;

public class JudgeIterator implements Iterator {
    //裁判的迭代器类
    private JudgeContainer judgeContainer;
    private int index;

    // 将操作对象容器传入
    public JudgeIterator(JudgeContainer judgeContainer) {
        this.judgeContainer = judgeContainer;
        this.index = 0;
    }

    //判断是否有下一个对象存在
    @Override
    public boolean hasNext() {
        return index < judgeContainer.size();
    }

    //指针后移
    @Override
    public Object next() {
        Judge judge = judgeContainer.get(index);
        index++;
        return judge;
    }
}
