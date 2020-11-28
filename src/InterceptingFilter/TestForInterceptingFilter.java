package InterceptingFilter;

public class TestForInterceptingFilter {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new HealthIdentification());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new LoggerFilter());

        filterManager.filterRequest("Athlete:GreenDog");
    }
}
