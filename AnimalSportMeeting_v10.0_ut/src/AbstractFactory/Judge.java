package AbstractFactory;

public class Judge {
    private String JudgeName;
    private Race JudgeRace;
    private GameType gameType;

    private JudgeIngredientFactory factory;// factory interface

    //getter & setter
    public JudgeIngredientFactory getFactory() {
        return factory;
    }

    public void setFactory(JudgeIngredientFactory factory) {//bind product factory
        this.factory = factory;
    }

    public String getJudgeName() {
        return JudgeName;
    }

    public void setJudgeName(String judgeName) {
        JudgeName = judgeName;
    }

    public GameType getGameType() {
        return gameType;
    }

    public Race getJudgeRace() {
        return JudgeRace;
    }

    public void setJudgeRace(Race judgeRace) {
        JudgeRace = judgeRace;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }
}
