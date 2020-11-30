package InterceptingFilter;

public class LoggerFilter implements Filter{
    //日志记录
    public void execute(String request){
        System.out.println("Request Log: " + request);
    }
}
