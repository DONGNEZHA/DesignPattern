package iterator;

import java.util.ArrayList;

public class AnimalsContainer implements Container{
    //建立animal容器

    private ArrayList<Animal> animals;

    public AnimalsContainer(){
        animals=new ArrayList<Animal>();
    }

    //根据指针返回容器对应的对象
    public Animal get(int index){
        return animals.get(index);
    }

    //在容器末尾增加对象
    public void add(Animal animal){
        animals.add(animal);
    }

    //返回容器大小
    public int size(){
        return animals.size();
    }

    //返回容器对象
    public ArrayList<Animal> getAnimals(){
        return animals;
    }

    //生成容器迭代器
    @Override
    public Iterator iterator() {
        return new AnimalsIterator(this);
    }
}
