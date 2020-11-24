package AbstractFactory;

public class JudgeStore {
    //单例模式
    private static JudgeStore instance = new JudgeStore();

    private JudgeStore() {
    }

    public static JudgeStore getInstance() {
        return instance;
    }

    public Judge createJudge(String JudgeName) {

        Judge judge = new Judge();
        JudgeIngredientFactory factory = null;

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

    public Judge orderJudge(String JudgeName) {
        Judge judge = createJudge(JudgeName);
        judge.makeJudge();
        return judge;
    }


}
