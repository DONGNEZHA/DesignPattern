package command;

public class GameCommand implements Command{
    @Override
    public void execute() throws InterruptedException {
        System.out.println("Game is starting...");
        Thread.sleep(2000);
        System.out.println("Game has started!");
    }
}
