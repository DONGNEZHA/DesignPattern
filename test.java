import Singleton.AnimalSportMeeting;

public class test {
    public static void main(String[] args) {

        AnimalSportMeeting object = AnimalSportMeeting.getInstance();
        //显示消息
        object.showMessage();
        //开启ASM流程
        object.flowController();
    }
}