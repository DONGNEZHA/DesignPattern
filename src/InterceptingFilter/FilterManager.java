package InterceptingFilter;

public class FilterManager {
    private FilterChain filterChain;

    public FilterManager(HealthIdentification healthIdentification){
        filterChain = new FilterChain();
        filterChain.setTarget(healthIdentification);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
