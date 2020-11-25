package Test;

import Interpreter.DiscountPrice;
import Interpreter.OriginalPrice;
import Interpreter.Price;

public class InterpreterTest {
    public void Test(){
        System.out.println("=================================================");
        System.out.println("| +++++\tInterpreter\t解释器模式\t测试\t+++++++ |");
        Price price = new Price();
        price.SetOriPrice(30.0f);
        System.out.println("| Price:\tSetOriPrice:\t已设置票原价为30.0f\t|");
        price.SetDiscount(0.7f);
        System.out.println("| Price:\tSetDiscount:\t已设置折扣为0.7f\t\t|");
        OriginalPrice oriPriceInterpreter = new OriginalPrice();
        System.out.println("| OriginalPrice:\t设置OriginalPrice解释器\t\t|");
        float result = oriPriceInterpreter.Methord(price);
        System.out.println("| OriginalPrice:\tMethord:\t原价为：" + result + "元\t|");
        DiscountPrice discountPriceInterpreter = new DiscountPrice();
        System.out.println("| DiscountPrice:\t设置DiscountPrice解释器\t\t|");
        result = discountPriceInterpreter.Methord(price);
        System.out.println("| DiscountPrice:\tMethord:\t折扣价为：" + result + "元\t|");
        System.out.println("| +++++\tInterpreter\t解释器模式\t测试完毕\t+++++++ |");
        System.out.println("=================================================");
    }
}
