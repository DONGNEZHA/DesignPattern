package Facade;

//外观类
 class Facade {

    //被委托的对象
    SubSystemA a;
    SubSystemB b;
    SubSystemC c;
    SubSystemD d;

    public Facade() {
        a = new SubSystemA();
        b = new SubSystemB();
        c = new SubSystemC();
        d = new SubSystemD();
    }

    //提供给外部访问的方法
    public void methodA() {
        this.a.dosomethingA();
    }

    public void methodB() {
        this.b.dosomethingB();
    }

    public void methodC() {
        this.c.dosomethingC();
    }

    public void methodD() {
        this.d.dosomethingD();
    }


//外观模式
void method(){
     methodA();
     methodB();
     methodC();
     methodD();
}
 }
//Subsystem子系统角色，从A到D
class SubSystemA {

    public void dosomethingA() {
        System.out.println("报名");
    }

}
 class SubSystemB {

    public void dosomethingB() {
        System.out.println("排队");
    }

}
 class SubSystemC {

    public void dosomethingC() {
        System.out.println("体检");
    }

}
class SubSystemD {

    public void dosomethingD() {
        System.out.println("检录");
    }

}
//Client客户端
class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.method();

    }

}