package command;

public class RankCommand implements Command{
    @Override
    public void execute() throws InterruptedException {
        System.out.println("Rank is opening...");
        Thread.sleep(2000);
        System.out.println("Rank has opened!");
    }
}
