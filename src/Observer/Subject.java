package Observer;

/**
 * 主题
 */
public interface Subject {
    // 观察者注册
    public void registerObserver(Observer observer);

    // 删除观察者
    public void removeObserver(Observer observer);

    // 当主题有内容更新时调用，用于通知观察者
    public void notifyObserver(int game, int rank[], double Score[]);
}
