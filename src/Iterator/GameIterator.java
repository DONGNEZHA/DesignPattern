package Iterator;

import Builder.Game;

public class GameIterator implements Iterator {

    private GameContainer gamesContainer;
    private int index;

    // 将操作对象容器传入
    public GameIterator(GameContainer gamesContainer) {
        this.gamesContainer = gamesContainer;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < gamesContainer.size();
    }

    @Override
    public Object next() {
        Game game = gamesContainer.get(index);
        index++;
        return game;
    }

}
