package Test;

public class Test {
    public static void main(String[] args){
        // 组合模式测试
        CompositeTest composite = new CompositeTest();
        composite.Test();
        // 解释器模式测试
        InterpreterTest interpreter = new InterpreterTest();
        interpreter.Test();
    }
}
