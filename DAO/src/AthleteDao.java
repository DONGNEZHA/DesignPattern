import java.util.List;

public interface AthleteDao {
    public List<Athlete> getAllAthletes();
    public Athlete getAthlete(int rollNo);
    public void updateAthlete(Athlete athlete);
    public void deleteAthlete(Athlete athlete);
}
