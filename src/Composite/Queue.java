package Composite;

import Animal.Animal;

public class Queue {
    private QueueNode root;
    private String queueName;

    public Queue(){
        root = null;
        queueName = "Null";
    }

    public void SetQueueName(String name){
        queueName = name;
    }

    public String GetQueueName(){
        return queueName;
    }

    public void SetRoot(Animal rootAnimal){
        if(root != null){
            System.out.println("root无法重复设置");
        }
        else{
            root = new QueueNode(rootAnimal);
        }
    }

    public QueueNode GetRootNode(){
        return root;
    }

    public Animal GetRootAnimal(){
        return root.GetAnimal();
    }

    public void Add(Animal newAnimal){
        QueueNode nowNode = root;
        if(nowNode == null){
            root = new QueueNode(newAnimal);
        }
        else {
            while (nowNode.GetNext() != null) {
                nowNode = nowNode.GetNext();
            }
            nowNode.SetNext(newAnimal);
        }
    }

    public void Reduce(){
        root = root.GetNext();
    }
}
