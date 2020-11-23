package Command_Memento;

import Decorator.Drink;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class CareTaker {
    private int mementoIndex = -1;
    private ArrayList<Memento> drinkOrderList = new ArrayList<Memento>();  //备忘录栈
    private ArrayDeque<Command> redoCommands = new ArrayDeque<>();    //redo命令栈
    private ArrayDeque<Command> commands = new ArrayDeque<>();    //命令栈

    //如果有了新的order，将新的drink状态保存在Memento中
    public void append(Command command, Memento memento) {
        mementoIndex++;
        commands.push(command);
        drinkOrderList.add(memento);
    }

    //如果undo,将最近状态pop出栈
    public void undo() {
        if (mementoIndex > 0) {
            Drink drink=commands.getLast().getMyDrink();
            redoCommands.push(commands.pop());
            mementoIndex--;
            drink.condiment=drinkOrderList.get(mementoIndex).getCondiment();
        }
        else {
            System.out.println("No commands left!");
        }
    }

    public void redo() throws InterruptedException {
        if(!redoCommands.isEmpty()){
            redoCommands.getFirst().execute();
            commands.push(redoCommands.pop());
            mementoIndex++;
        }
        else {
            System.out.println("No RedoCommands left!");
        }
    }

    public void clear(){
        redoCommands.clear();
    }
}
