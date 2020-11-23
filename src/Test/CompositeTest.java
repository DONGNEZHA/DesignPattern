package Test;

import Composite.Queue;
import Animal.Animal;
import Composite.QueueNode;

public class CompositeTest {
    public void Test(){
        System.out.println("=================================================");
        System.out.println("| +++++++\tComposite\t组合模式\t测试\t+++++++ |");
        Queue queue = new Queue();
        int n = 3;
        Animal a[] = new Animal[n];
        for(int i = 0; i < n; ++i){
            a[i] = new Animal("Animal_" + i);
        }
        System.out.println("| 已创建Animal_1,2,3三个动物\t\t\t\t\t\t|");
        System.out.println("| 使用Add添加队列成员\t\t\t\t\t\t\t\t|");
        for(int i = 0; i < n; ++i){
            queue.Add(a[i]);
            System.out.println("| Animal_" + i + "已加入队尾\t\t\t\t\t\t\t\t|");
        }
        System.out.println("| 当前队列为：\t\t\t\t\t\t\t\t\t|");
        QueueNode nowNode = queue.GetRootNode();
        for(int i = 0; i < n; ++i){
            System.out.println("| " + nowNode.GetAnimalName() + "\t\t\t\t\t\t\t\t\t\t|");
            nowNode = nowNode.GetNext();
        }
        System.out.println("| 使用Reduce缩短队列\t\t\t\t\t\t\t\t|");
        int m = n;
        for(int i = 0; i < n; ++i){
            System.out.println("| 执行Reduce\t\t\t\t\t\t\t\t\t|");
            System.out.println("| " + queue.GetRootAnimal().GetAnimalName() + "已退出队列\t\t\t\t\t\t\t\t|");
            queue.Reduce();
            if(queue.GetRootNode() == null){
                System.out.println("| 当前队列已空\t\t\t\t\t\t\t\t\t|");
            }
            else {
                System.out.println("| 当前队列中有：\t\t\t\t\t\t\t\t\t|");
                m--;
                nowNode = queue.GetRootNode();
                for (int j = 0; j < m; ++j) {
                    System.out.println("| " + nowNode.GetAnimalName() + "\t\t\t\t\t\t\t\t\t\t|");
                    nowNode = nowNode.GetNext();
                }
            }
        }
        System.out.println("| +++++\tConposite\t组合模式\t\t测试完毕\t+++++++ |");
        System.out.println("=================================================");
    }
}
