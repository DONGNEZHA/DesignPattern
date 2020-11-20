package Builder;

import java.util.ArrayList;
import java.util.List;

public class Game {
    String name;
    public List<Athlete> athleteLists = new ArrayList<Athlete>();
    Judge judge;

    public void addAthlete(Athlete athlete) {
        athleteLists.add(athlete);
    }

    public Game(String Name) {
        name = Name;
        judge = new Judge("Judge1");
        addAthlete(new Athlete("Athlete1"));
        addAthlete(new Athlete("Athlete2"));
        addAthlete(new Athlete("Athlete3"));
        addAthlete(new Athlete("Athlete4"));
    }



}
