package command;

public class SpectatorCommand implements Command{
    @Override
    public void execute() throws InterruptedException {
        System.out.println("Entering...");
        Thread.sleep(2000);
        System.out.println("You are watching a game now!");
    }
}
