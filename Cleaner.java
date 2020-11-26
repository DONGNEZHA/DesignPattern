package ServantDesignPattern;

public  class Cleaner{
    //仆人动物类
    //提供的具体服务内容：打扫操场的跑道和草坪
    public void clean(IsCleanable cleanable){
        cleanable.cleaned();
    }
}
