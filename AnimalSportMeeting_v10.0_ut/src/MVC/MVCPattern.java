package MVC;

import SimpleFactory.Athlete;
import SimpleFactory.AthleteFactory;

import java.util.Scanner;

public class MVCPattern {
    public static void main(String[] args) {
        Athlete model = getAniaml();

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

    private static Athlete getAniaml(){
        return new AthleteFactory().createAthlete("Cat", "Green");
    }
}
