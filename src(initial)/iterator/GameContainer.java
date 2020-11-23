package iterator;

import java.util.ArrayList;

public class GameContainer implements Container{
    //建立game容器

    private ArrayList<Game> games;

    public GameContainer(){
        games=new ArrayList<Game>();
    }

    //根据指针返回容器对应的对象
    public Game get(int index){
        return games.get(index);
    }

    //在容器末尾增加对象
    public void add(Game animal){
        games.add(animal);
    }

    //返回容器大小
    public int size(){
        return games.size();
    }

    //返回容器对象
    public ArrayList<Game> getAnimals(){
        return games;
    }

    //生成容器迭代器
    @Override
    public Iterator iterator() {
        return new GameIterator(this);
    }
}
