package InterceptingFilter;

public class AuthenticationFilter implements Filter{
    //授权过滤器
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
