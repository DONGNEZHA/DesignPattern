package ServantDesignPattern;

public  class Lawn implements IsCleanable {
    //实现 IServiced，并完成具体逻辑
    //具体被服务的对象
    //仆人动物打扫草坪
    public void cleaned(){
        System.out.println("Lawn:clean:草坪被清理干净");
    }
}

