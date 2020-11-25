package Test;

import Interpreter.ExchangePrice;
import Interpreter.OriginalPrice;
import Interpreter.Price;

public class InterpreterTest {
    public void Test(){
        System.out.println("=================================================");
        System.out.println("| +++++\tInterpreter\t������ģʽ\t����\t+++++++ |");
        Price price = new Price();
        price.SetOriPrice(10f);
        System.out.println("| ������ԭ��Ϊ10\t\t\t\t\t\t\t\t|");
        price.SetExchange(10f);
        System.out.println("| �����û���Ϊ1��10\t\t\t\t\t\t\t\t|");
        OriginalPrice oriPriceInterpreter = new OriginalPrice();
        System.out.println("| ����OriginalPrice�������������۸����ԭ�ۣ�\t\t|");
        float result = oriPriceInterpreter.Method(price);
        System.out.println("| ԭ��Ϊ��" + result + "\t\t\t\t\t\t\t\t\t|");
        ExchangePrice discountPriceInterpreter = new ExchangePrice();
        System.out.println("| ����DiscountPrice�������������۸����ת���ۣ�\t|");
        result = discountPriceInterpreter.Method(price);
        System.out.println("| �ۿۼ�Ϊ��" + result + "\t\t\t\t\t\t\t\t\t|");
        System.out.println("| +++++\tInterpreter\t������ģʽ\t�������\t+++++++ |");
        System.out.println("=================================================");
    }
}
