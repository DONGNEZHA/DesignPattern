package iterator;

public class AnimalsIterator implements Iterator {

    private AnimalsContainer animalsContainer;
    private int index;

    // 将操作对象容器传入
    public AnimalsIterator(AnimalsContainer animalsContainer) {
        this.animalsContainer = animalsContainer;
        this.index = 0;
    }

    //判断是否有下一个对象存在
    @Override
    public boolean hasNext() {
        if (index < animalsContainer.size())
            return true;
        else
            return false;
    }

    //指针后移
    @Override
    public Object next() {
        Animal animal=animalsContainer.get(index);
        index++;
        return animal;
    }
}
