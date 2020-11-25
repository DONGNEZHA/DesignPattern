package Iterator;

import Builder.Game;

import java.util.ArrayList;

public class GameContainer implements Container {

    //单例模式，使运动员管理器可以被全局访问
    private static GameContainer instance = new GameContainer();
    //建立game容器
    private ArrayList<Game> games;

    private GameContainer() {
        games = new ArrayList<>();
    }

    public static GameContainer getInstance() {
        return instance;
    }

    //根据指针返回容器对应的对象
    public Game get(int index) {
        return games.get(index);
    }

    //在容器末尾增加对象
    public void add(Game game) {
        games.add(game);
    }

    //返回容器大小
    public int size() {
        return games.size();
    }

    //返回容器对象
    public ArrayList<Game> getGames() {
        return games;
    }

    //生成容器迭代器
    @Override
    public Iterator iterator() {
        return new GameIterator(this);
    }
}
