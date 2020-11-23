package Composite;

import Animal.Animal;

public class QueueNode {
    private Animal animal;
    private QueueNode next;

    public QueueNode(Animal animal){
        this.animal = animal;
        next = null;
    }

    public void SetAnimal(Animal newAnimal){
        animal = newAnimal;
    }

    public void SetNext(Animal nextAnimal){
        next = new QueueNode(nextAnimal);
    }

    public Animal GetAnimal(){
        return animal;
    }

    public QueueNode GetNext(){
        return next;
    }

    public String GetAnimalName() {
        return animal.GetAnimalName();
    }
}
