import Singleton_LazyInitialization.AnimalSportMeeting;
import Singleton_LazyInitialization.MainTest;

import java.util.Scanner;

//项目主函数
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        System.out.println("欢迎使用动物运动会模拟系统！");
        System.out.println("选择启动模式 [1]游玩模式 [2]测试模式");
        Scanner input = new Scanner(System.in);
        int opt = input.nextInt();
        if (opt == 1) {
            AnimalSportMeeting ASM = AnimalSportMeeting.getInstance();
            //开启ASM流程
            ASM.flowController();
        } else if (opt == 2) {
            MainTest.getInstance().TestController();
        }
    }
}