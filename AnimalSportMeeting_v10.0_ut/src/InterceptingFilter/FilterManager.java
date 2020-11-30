package InterceptingFilter;

public class FilterManager {
    //过滤器管理者
    private FilterChain filterChain;      //存储过滤器

    public FilterManager(HealthIdentification healthIdentification){
        filterChain = new FilterChain();
        filterChain.setTarget(healthIdentification);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    //执行过滤器操作
    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
