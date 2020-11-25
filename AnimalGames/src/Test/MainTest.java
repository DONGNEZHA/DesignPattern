package Test;

import Test.DetailTest.FlyweightPattern;
import Test.DetailTest.MVCPattern;
import Test.DetailTest.PrototypePattern;
import Test.DetailTest.TemplatePattern;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Boolean flag = true;
        String str;
        while (flag){
            System.out.println("plz input the number of patterns.");
            System.out.println("1.flyweight 2.prototype 3.template 4.MVC Q.quit");
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            switch (str){
                case "1":
                    FlyweightPattern.main(new String[]{});break;
                case "2":
                    PrototypePattern.main(new String[]{});break;
                case "3":
                    TemplatePattern.main(new String[]{});break;
                case "4":
                    MVCPattern.main(new String[]{});break;
                case "Q":
                    flag=false;break;
            }
        }
    }
}
