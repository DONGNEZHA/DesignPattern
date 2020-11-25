package Observer;

import Iterator.AthleteContainer;

public class AthleteObserve implements Observer {

    int AthleteNum;

    public AthleteObserve(int athleteNum) {
        AthleteNum = athleteNum;
    }

    @Override
    public void update(int game, int rank, double Score) {
        AthleteContainer.getInstance().get(AthleteNum).getRank()[game] = rank;
        AthleteContainer.getInstance().get(AthleteNum).getScore()[game] = Score;
    }
}
