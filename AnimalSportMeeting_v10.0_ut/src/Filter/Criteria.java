package Filter;


import SimpleFactory.Athlete;

import java.util.ArrayList;

public interface Criteria {
    //标准接口
    abstract ArrayList<Athlete> meetCriteria(ArrayList<Athlete> athleteList);
}
