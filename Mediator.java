package Mediator;//抽象中介者

 public abstract class Mediator {

//抽象的发送消息方法
            public abstract void send(String message, Colleague colleague);

         }

         //抽象同事类，也就是运动员和普通人的抽象类
 abstract class Colleague {

     protected Mediator mediator;

     public Colleague(Mediator mediator) {
         this.mediator = mediator;
     }

 }

 //具体中介者类

 class ConcreteMediator extends Mediator {

     private ConcreteColleague1 colleague1;
     private ConcreteColleague2 colleague2;

     public void setColleague1(ConcreteColleague1 colleague1) {
         this.colleague1 = colleague1;
     }

     public void setColleague2(ConcreteColleague2 colleague2) {
         this.colleague2 = colleague2;
     }

     @Override
     public void send(String message, Colleague colleague) {
         if(colleague == colleague1) {
             colleague2.notify(message);
         } else {
             colleague1.notify(message);
         }
     }

 }

 //具体同事类1，普通人
 class ConcreteColleague1 extends Colleague {

     public ConcreteColleague1(Mediator mediator) {
         super(mediator);
     }

     public void send(String message) {
         mediator.send(message, this);
     }

     public void notify(String message) {
         System.out.println("普通人得到消息：" + message);
     }

 }

 //具体同事类2，运动员
 class ConcreteColleague2 extends Colleague {

     public ConcreteColleague2(Mediator mediator) {
         super(mediator);
     }

     public void send(String message) {
         mediator.send(message, this);
     }

     public void notify(String message) {
         System.out.println("运动员得到消息：" + message);
     }

 }

 //Client客户端
 class Client {

     public static void main(String[] args) {
         ConcreteMediator mediator = new ConcreteMediator();

         ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
         ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

         mediator.setColleague1(colleague1);
         mediator.setColleague2(colleague2);

         colleague1.send("普通人要求运动员参会");
         colleague2.send("运动员已经参会");
     }

 }






