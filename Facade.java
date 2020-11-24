package Facade;

//外观类
 public class Facade {

    //被委托的对象,报名，排队，体检，检录
    baoming a;
    paidui b;
    tijian c;
    jianlu d;
//外观设计模式创建新的报名，排队等过程
    public Facade() {
        a = new baoming();
        b = new paidui();
        c = new tijian();
        d = new jianlu();
    }

    //提供给外部访问的方法，做这四个工作
    public void method_baoming() { this.a.dosomething_baoming();}

    public void method_paidui() {
        this.b.dosomething_paidui();
    }

    public void method_tijian() {
        this.c.dosomething_tijian();
    }

    public void method_jianlu() {
        this.d.dosomething_jianlu();
    }


//外观设计的四个method
public void method(){
     method_baoming();
     method_paidui();
     method_tijian();
     method_jianlu();
}
 }
//facade中四个子系统角色，及其输出
class baoming {//报名类

    public void dosomething_baoming() {
        System.out.println("baoming:method_baoming：运动员报名");
    }

}
 class paidui {//排队类

    public void dosomething_paidui() {
        System.out.println("paidui:method_paidui:运动员参与排队");
    }

}
 class tijian {//体检类

    public void dosomething_tijian() {
        System.out.println("tijian:method_tijian:运动员体检");
    }

}
class jianlu {//检录类

    public void dosomething_jianlu() {
        System.out.println("jianlu:method_jianlu:运动员入场检录");
    }

}
//Client客户端与主函数
 class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.method();

    }

}