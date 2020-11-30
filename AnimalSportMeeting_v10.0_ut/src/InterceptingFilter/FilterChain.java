package InterceptingFilter;

import java.util.ArrayList;

public class FilterChain {
    //过滤器链，存储各个过滤器

    private ArrayList<Filter> filters = new ArrayList<Filter>();
    private HealthIdentification healthIdentification;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        healthIdentification.execute(request);
    }

    public void setTarget(HealthIdentification healthIdentification){
        this.healthIdentification = healthIdentification;
    }
}
