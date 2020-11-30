package Observer;

import Iterator.AthleteContainer;

public class AthleteObserve implements Observer {

    int AthleteNum;

    public AthleteObserve(int athleteNum) {
        AthleteNum = athleteNum;
    }

    //更新同步数据
    @Override
    public void update(int game, int rank, double score) {
        AthleteContainer.getInstance().get(AthleteNum).getRank()[game] = rank;
        AthleteContainer.getInstance().get(AthleteNum).getScore()[game] = score;
    }
}
