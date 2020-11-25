package Observer;

public class AnimalGames implements Observer{
    int num=0;

public AnimalGames(int num){
    this.num=num;
}
    @Override
    public void update(int[] rank) {
        System.out.println("编号为"+num+"的运动员名次为"+rank[num]);
    }
}
