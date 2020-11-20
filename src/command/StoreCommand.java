package command;

public class StoreCommand implements Command{
    @Override
    public void execute() throws InterruptedException {
        System.out.println("Store is opening...");
        Thread.sleep(2000);
        System.out.println("Store has opened!");
    }
}
