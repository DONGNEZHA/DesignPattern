package AbstractFactory;

public class Judge {
    String JudgeName;
    Race JudgeRace;
    GameType gameType;

    JudgeIngredientFactory factory;// factory interface

    public void setFactory(JudgeIngredientFactory factory) {//bind product factory
        this.factory = factory;
    }

    public void makeJudge() {

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
}
