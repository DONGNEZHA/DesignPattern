import Singleton.AnimalSportMeeting;

public class Main {
    public static void main(String[] args) {
        AnimalSportMeeting object = AnimalSportMeeting.getInstance();
        //开启ASM流程
        object.flowController();
    }
}