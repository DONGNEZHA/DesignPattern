package InterceptingFilter;

public class LoggerFilter implements Filter{
    public void execute(String request){
        System.out.println("Request Log: " + request);
    }
}
