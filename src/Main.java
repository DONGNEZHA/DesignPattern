import Singleton_LazyInitialization.AnimalSportMeeting;
import Singleton_LazyInitialization.MainTest;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

//        AnimalSportMeeting ASM = AnimalSportMeeting.getInstance();
//        //开启ASM流程
//        ASM.flowController();
        MainTest.getInstance().TestController();

    }
}