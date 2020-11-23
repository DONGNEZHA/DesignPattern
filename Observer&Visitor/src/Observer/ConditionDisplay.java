package Observer;
/*
 *  布告板上的状态显示
 */
public class ConditionDisplay implements Observer,DisplayElement{
    private int ranking;
    private Subject animalGames;

    public ConditionDisplay(Subject animalGames) {
        // 构造时需要间主题/被观察者对象作为注册之用
        this.animalGames = animalGames;
        animalGames.registerObserver(this);
    }

    @Override
    public void display() {
        // 将数据显示在布告板上
        System.out.println("显示该运动员排名为：" + ranking );
    }

    @Override
    public void update(int ranking) {
        // 接受来自主题/被观察者的数据
        this.ranking = ranking;
        display();
    }
}
