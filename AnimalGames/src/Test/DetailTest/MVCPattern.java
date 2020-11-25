package Test.DetailTest;

import AniamlGames.MVC.Animal.Animal;
import AniamlGames.MVC.Animal.AnimalStore;
import AniamlGames.MVC.AnimalController;
import AniamlGames.MVC.AnimalViews;

import java.util.Scanner;

public class MVCPattern {
    public static void main(String[] args) {
        Animal model = getAniaml();

        AnimalViews views = new AnimalViews();

        AnimalController controller = new AnimalController(model,views);

        controller.updateView();

        String str;
        System.out.println("plz input new name:");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        controller.setAnimalName(str);

        controller.updateView();
    }

    private static Animal getAniaml(){
        AnimalStore animalStore=new AnimalStore();
        Animal animal=animalStore.orderAnimal("GreenDog");
        return animal;
    }
}
