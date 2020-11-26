package ServantDesignPattern;


public  class  Runway implements IsCleanable {
    //实现 IServiced，并完成具体逻辑
    //具体被服务的对象
    //仆人动物打扫跑道
    public void cleaned(){
        System.out.println("Runway:clean:跑道被清理干净");
    }
}
