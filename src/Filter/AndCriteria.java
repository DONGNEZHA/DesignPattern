package Filter;

import SimpleFactory.Athlete;

import java.util.ArrayList;

public class AndCriteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public ArrayList<Athlete> meetCriteria(ArrayList<Athlete> athletes) {
        ArrayList<Athlete> firstCriteriaAthletes = criteria.meetCriteria(athletes);
        return otherCriteria.meetCriteria(firstCriteriaAthletes);
    }
}
