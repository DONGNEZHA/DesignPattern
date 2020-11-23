package Observer;
/**
 *  主题
 */
public interface Subject {
    // 观察者注册
    public void registerObserver(Observer o);
    // 删除观察者
    public void removeObserver(Observer o);
    // 当主题有内容更新时调用，用于通知观察者
    public void notifyObserver();
}
