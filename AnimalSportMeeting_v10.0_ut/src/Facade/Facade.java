package Facade;

//外观类
public class Facade {

    //被委托的对象,报名,排队,体检,检录
    SignUp a;
    LineUp b;
    Exam c;
    CheckIn d;

    //外观设计模式创建新的报名，排队等过程
    public Facade() {
        a = new SignUp();
        b = new LineUp();
        c = new Exam();
        d = new CheckIn();
    }

    //提供给外部访问的方法，做这四个工作
    public void method_Signup() {
        this.a.dosomething();
    }

    public void method_LineUp() {
        this.b.dosomething();
    }

    public void method_Exam() {
        this.c.dosomething();
    }

    public void method_CheckIn() {
        this.d.dosomething();
    }


    //外观设计的四个method
    public void method() {
        method_Signup();
        method_LineUp();
        method_Exam();
        method_CheckIn();
    }
}
