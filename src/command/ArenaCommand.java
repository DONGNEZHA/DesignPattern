package command;

public class ArenaCommand implements Command{
    @Override
    public void execute() throws InterruptedException {
        System.out.println("Arena is starting...");
        Thread.sleep(2000);
        System.out.println("Arena has started!");
    }
}
