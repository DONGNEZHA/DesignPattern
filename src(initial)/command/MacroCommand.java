package command;

import java.util.ArrayDeque;
import java.util.Iterator;

public class MacroCommand implements Command {

    private ArrayDeque<Command> commands = new ArrayDeque<Command>();    //使用ArrayDeque实现命令栈

    //执行压入命令栈中的每条命令，通过迭代器调用执行方法
    @Override
    public void execute() throws InterruptedException {
        Iterator iteraor = commands.iterator();
        while (iteraor.hasNext()) {
            ((Command) iteraor.next()).execute();
        }
    }

    //如果有了新的命令，将新的命令压入栈中
    public void append(Command cmd) {
        if (cmd != this) {
            commands.add(cmd);
        }
    }

    //如果撤回命令，则将命令对象pop出栈
    public void undo() {
        if (!commands.isEmpty()) {
            commands.removeLast();
        }
    }

    //栈清空
    public void clear() {
        commands.clear();
    }
}
