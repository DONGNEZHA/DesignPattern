package Filter;


import SimpleFactory.Athlete;

import java.util.ArrayList;

public interface Criteria {
    abstract ArrayList<Athlete> meetCriteria(ArrayList<Athlete> athleteList);
}
