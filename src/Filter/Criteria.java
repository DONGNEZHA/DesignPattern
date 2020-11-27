package Filter;


import SimpleFactory.Athlete;

import java.util.ArrayList;

public interface Criteria {
    public ArrayList<Athlete> meetCriteria(ArrayList<Athlete> athleteList);
}
