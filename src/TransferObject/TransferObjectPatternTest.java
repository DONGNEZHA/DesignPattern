package TransferObject;


import java.util.Scanner;

public class TransferObjectPatternTest {
    public static void main(String[] args) {
        AnimalBO animalBusinessObject = new AnimalBO();
        String str;
        String mes;
        AnimalVO animal;
        boolean flag = true;
        System.out.println("这里登记着参加运动会的动物们!\n" +
                "输入1查看所有参加的动物们\n" +
                "输入2修改动物的信息\n" +
                "输入Q退出\n" +
                "目前参加的有:");
        for (AnimalVO animals : animalBusinessObject.getAllAnimals()) {
            System.out.println("序号 : "
                    +animals.getRollNo()+", 名字 : "+animals.getName());
        }
        while (flag) {
            System.out.println("选择指令:");
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            switch (str) {
                case "1": {
                    System.out.println("目前参加的有:");
                    for (AnimalVO animals : animalBusinessObject.getAllAnimals()) {
                        System.out.println("序号 : "
                                +animals.getRollNo()+", 名字 : "+animals.getName());
                    }
                }
                break;
                case "2": {
                    System.out.println("输入需要修改的动物序号:");
                    sc = new Scanner(System.in);
                    mes = sc.nextLine();
                    if(Integer.parseInt(mes) !=0 &&Integer.parseInt(mes) !=1&&Integer.parseInt(mes) !=2){
                        System.out.println("序号不存在!");
                    }else {
                        animal = animalBusinessObject.getAllAnimals().get(Integer.parseInt(mes));
                        System.out.println("输入修改的信息:");
                        sc = new Scanner(System.in);
                        mes = sc.nextLine();
                        animal.setName(mes);
                        animalBusinessObject.updateAnimal(animal);
                    }
                }
                break;
                case "Q":
                case "q": {
                    flag = false;
                }
                break;
                default: {
                    System.out.println("指令不存在,输入正确指令!");
                }
                break;
            }
        }
    }
}