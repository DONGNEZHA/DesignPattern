package command;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        MacroCommand commandList= new MacroCommand();

        ArenaCommand arena= new ArenaCommand();
        FlowCommand flow=new FlowCommand();
        GameCommand game=new GameCommand();
        RankCommand rank =new RankCommand();
        SpectatorCommand spectator=new SpectatorCommand();
        StoreCommand store=new StoreCommand();

        commandList.append(arena);
        commandList.append(flow);
        commandList.append(game);
        commandList.append(rank);
        commandList.append(spectator);
        commandList.append(store);

        System.out.println("Testing CommandList：");
        commandList.execute();

        commandList.undo();
        System.out.println("\nAfter undoing StoreCommand:");
        commandList.execute();
    }
}
