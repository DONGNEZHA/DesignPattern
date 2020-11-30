package Prototpye_Flyweight;

import java.util.Scanner;

//  @program: AnimalGame
//  @description: The test class for FlyweightPattern
//  @author: Xinyu Cui
//  @create: 2020/11/12

public class FlyweightPattern {
    private static final String colors[] =
            {"Black", "White", "Yellow", "Brown", "Gray"};

    public static void main(String[] args) {
        System.out.println("Please enter the race of the audience!");
        System.out.println("\"1\":DogAudience \"2\":CatAudience \"3\":BirdAudience");
        System.out.println("Input \"view\" to view the counter!");
        System.out.println("Input \"detail\" to view the detail audience!");
        System.out.println("Input \"Q\" to quit!");
        int counter = 0;
        int dogCounter = 0;
        int[] dogsCounter = new int[5];
        int catCounter = 0;
        int[] catsCounter = new int[5];
        int birdCounter = 0;
        int[] bearsCounter = new int[5];
        String str = "";
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            switch (str) {
                case "1": {
                    String color = getRandomColor();
                    if (color == "Black") {
                        dogsCounter[0]++;
                    } else if (color == "White") {
                        dogsCounter[1]++;
                    } else if (color == "Yellow") {
                        dogsCounter[2]++;
                    } else if (color == "Brown") {
                        dogsCounter[3]++;
                    } else if (color == "Gray") {
                        dogsCounter[4]++;
                    }
                    DogAudience dogAudience = (DogAudience) AttributeFactory.setDogAudience(color);
                    dogAudience.setAge(getRandomAge());
                    dogAudience.setSex(getRandomSex());
                    dogAudience.printRace();
                    dogCounter++;
                    counter++;
                }
                ;
                break;
                case "2": {
                    String color = getRandomColor();
                    if (color == "Black") {
                        catsCounter[0]++;
                    } else if (color == "White") {
                        catsCounter[1]++;
                    } else if (color == "Yellow") {
                        catsCounter[2]++;
                    } else if (color == "Brown") {
                        catsCounter[3]++;
                    } else if (color == "Gray") {
                        catsCounter[4]++;
                    }
                    CatAudience catAudience = (CatAudience) AttributeFactory.setCatAudience(color);
                    catAudience.setAge(getRandomAge());
                    catAudience.setSex(getRandomSex());
                    catAudience.printRace();
                    catCounter++;
                    counter++;
                }
                ;
                break;
                case "3": {
                    String color = getRandomColor();
                    if (color == "Black") {
                        bearsCounter[0]++;
                    } else if (color == "White") {
                        bearsCounter[1]++;
                    } else if (color == "Yellow") {
                        bearsCounter[2]++;
                    } else if (color == "Brown") {
                        bearsCounter[3]++;
                    } else if (color == "Gray") {
                        bearsCounter[4]++;
                    }
                    BearAudience bearAudience = (BearAudience) AttributeFactory.setBearAudience(color);
                    bearAudience.setAge(getRandomAge());
                    bearAudience.setSex(getRandomSex());
                    bearAudience.printRace();
                    birdCounter++;
                    counter++;
                }
                ;
                break;
                case "detail": {
                    System.out.println("Black DogAudience:" + dogsCounter[0] + ", White DogAudience:" + dogsCounter[1] +
                            ", Yellow DogAudience:" + dogsCounter[2] + ", Brown DogAudience:" + dogsCounter[3] + ", Gray DogAudience:" + dogsCounter[4]);
                    System.out.println("Black CatAudience:" + catsCounter[0] + ", White CatAudience:" + catsCounter[1] +
                            ", Yellow CatAudience:" + catsCounter[2] + ", Brown CatAudience:" + catsCounter[3] + ", Gray CatAudience:" + catsCounter[4]);
                    System.out.println("Black BirdAudience:" + bearsCounter[0] + ", White BirdAudience:" + bearsCounter[1] +
                            ", Yellow BirdAudience:" + bearsCounter[2] + ", Brown BirdAudience:" + bearsCounter[3] + ", Gray BirdAudience:" + bearsCounter[4]);
                }
                ;
                break;
                case "view": {
                    System.out.println("The number of Audience:" + counter);
                    System.out.println("The number of DogAudience:" + dogCounter);
                    System.out.println("The number of CatAudience:" + catCounter);
                    System.out.println("The number of BirdAudience:" + birdCounter);
                }
                ;
                break;
                case "Q": {
                    flag = false;
                }
                ;
                break;
                default: {
                    System.out.println("Invalid input,please try again!");
                }
                ;
                break;
            }
        }
    }

    public static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static int getRandomAge() {
        int maxAge = 60;
        int minAge = 1;
        return minAge + (int) (Math.random() * maxAge);
    }

    public static String getRandomSex() {
        if (((Math.random() * 100) % 2) == 1) {
            return "MALE";
        } else {
            return "FEMALE";
        }
    }
}
