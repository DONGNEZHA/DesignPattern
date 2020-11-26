package Interpreter;

public class InterpreterTest {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("| +++++\tInterpreter\t解释器模式\t测试\t+++++++ |");
        Price price = new Price();
        price.SetOriPrice(10f);
        System.out.println("| 已设置原价为10\t\t\t\t\t\t\t\t|");
        price.SetExchange(10f);
        System.out.println("| 已设置汇率为1：10\t\t\t\t\t\t\t\t|");
        OriginalPrice oriPriceInterpreter = new OriginalPrice();
        System.out.println("| 设置OriginalPrice解释器，解析价格，输出原价：\t\t|");
        float result = oriPriceInterpreter.Method(price);
        System.out.println("| 原价为：" + result + "\t\t\t\t\t\t\t\t\t|");
        ExchangePrice discountPriceInterpreter = new ExchangePrice();
        System.out.println("| 设置DiscountPrice解释器，解析价格，输出转换价：\t|");
        result = discountPriceInterpreter.Method(price);
        System.out.println("| 折扣价为：" + result + "\t\t\t\t\t\t\t\t\t|");
        System.out.println("| +++++\tInterpreter\t解释器模式\t测试完毕\t+++++++ |");
        System.out.println("=================================================");
    }
}
