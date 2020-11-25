package Observer;

/**
 * 观察者
 */
public interface Observer {

    // 当排行榜上运动员的排名发生变化时，主题会把参数值传给观察者

    void update(int game, int rank, double Score);
}



