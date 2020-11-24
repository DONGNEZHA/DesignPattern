package Mediator;
//抽象中介者类

 public abstract class Mediator {

//抽象的发送消息方法
            public abstract void send(String message, Colleague colleague);

         }

         //抽象同事类，也就是运动员和普通动物的抽象类


 //具体中介者类



 //具体同事类，普通动物


 //具体同事类，运动员

 //Client客户端
 class Client {

     public static void main(String[] args) {
         ConcreteMediator mediator = new ConcreteMediator();

         ConcreteOthers Others = new ConcreteOthers(mediator);
         ConcreteAthlete Athlete = new ConcreteAthlete(mediator);

         mediator.setOthers(Others);
         mediator.setAthlete(Athlete);

         Others.send("普通动物要求运动员参会");
         Athlete.send("运动员已经参会");
     }

 }






