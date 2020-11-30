package AbstractFactory;

public class JudgeStore {
    //单例模式
    private static JudgeStore instance = new JudgeStore();
    private JudgeStore() { }
    public static JudgeStore getInstance() {
        return instance;
    }

    //选择对应工厂
    public Judge createJudge(String JudgeName) {

        Judge judge = new Judge();
        JudgeIngredientFactory factory;

        switch (JudgeName) {
            case "MS400":
                factory = new MS400Factory();
                judge.setFactory(factory);
                break;
            case "DS400":
                factory = new DS400Factory();
                judge.setFactory(factory);
                break;
            case "MR100":
                factory = new MR100Factory();
                judge.setFactory(factory);
                break;
            case "DR100":
                factory = new DR100Factory();
                judge.setFactory(factory);
                break;
            case "MR1000":
                factory = new MR1000Factory();
                judge.setFactory(factory);
                break;
            case "DR1000":
                factory = new DR1000Factory();
                judge.setFactory(factory);
                break;
            default:
                break;
        }

        return judge;
    }

    //设置项目、种族
    public Judge orderJudge(String JudgeName) {
        Judge judge = createJudge(JudgeName);
        judge.setGameType(judge.getFactory().CreateType());
        judge.setJudgeRace(judge.getFactory().CreateRace());
        return judge;
    }

}
