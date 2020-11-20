package command;

public class FlowCommand implements Command{

    @Override
    public void execute() throws InterruptedException {
        System.out.println("Flow is opening...");
        Thread.sleep(2000);
        System.out.println("Flow has opened!");

    }
}
