package DAO;

import java.util.List;

public interface AthleteDao {
    List<Athlete> getAllAthletes();

    Athlete getAthlete(int rollNo);

    void updateAthlete(Athlete athlete);//更新运动员

    void deleteAthlete(Athlete athlete);//删除运动员
}
