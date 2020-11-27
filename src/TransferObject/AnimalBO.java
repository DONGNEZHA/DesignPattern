package TransferObject;

import java.util.ArrayList;
import java.util.List;

public class AnimalBO {
    List<AnimalVO> animals;

    public AnimalBO(){
        animals = new ArrayList<>();
        AnimalVO animal1 = new AnimalVO("狗子",0);
        AnimalVO animal2 = new AnimalVO("猫猫",1);
        AnimalVO animal3 = new AnimalVO("胖头鱼",2);
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
    }
    public void deleteAnimal(AnimalVO animal) {
        animals.remove(animal.getRollNo());
        System.out.println("序号 : "
                + animal.getRollNo() +", 名字 : "+animal.getName()+", 已经离开了!");
    }


    public List<AnimalVO> getAllAnimals() {
        return animals;
    }

    public AnimalVO getAnimal(int rollNo) {
        return animals.get(rollNo);
    }

    public void updateAnimal(AnimalVO animal) {
        animals.get(animal.getRollNo()).setName(animal.getName());
        System.out.println("序号 : "
                + animal.getRollNo() +", 名字 : "+animal.getName()+", 加入了运动会!");
    }
}