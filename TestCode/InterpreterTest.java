package TestCode;

import Interpreter.DiscountPrice;
import Interpreter.OriginalPrice;
import Interpreter.Price;

public class InterpreterTest {
    public void Test(){
        System.out.println("=================================================");
        System.out.println("| +++++\tInterpreter\t解释器模式\t测试\t+++++++ |");
        Price price = new Price();
        price.SetOriPrice(30.0f);
        System.out.println("| 已设置原价为30.0f\t\t\t\t\t\t\t\t|");
        price.SetDiscount(0.7f);
        System.out.println("| 已设置折扣为0.7f\t\t\t\t\t\t\t\t|");
        OriginalPrice oriPriceInterpreter = new OriginalPrice();
        System.out.println("| 设置OriginalPrice解释器，解析价格，输出原价：\t\t|");
        float result = oriPriceInterpreter.Methord(price);
        System.out.println("| 原价为：" + result + "\t\t\t\t\t\t\t\t\t|");
        DiscountPrice discountPriceInterpreter = new DiscountPrice();
        System.out.println("| 设置DiscountPrice解释器，解析价格，输出折扣价：\t|");
        result = discountPriceInterpreter.Methord(price);
        System.out.println("| 折扣价为：" + result + "\t\t\t\t\t\t\t\t\t|");
        System.out.println("| +++++\tInterpreter\t解释器模式\t测试完毕\t+++++++ |");
        System.out.println("=================================================");
    }
}
