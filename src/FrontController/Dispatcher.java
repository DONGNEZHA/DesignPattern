package FrontController;

public class Dispatcher {
    private JudgeView judgeView;
    private AthleteView athleteView;

    public Dispatcher() {
        judgeView = new JudgeView();
        athleteView = new AthleteView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("JUDGE")) {
            judgeView.show();
        } else {
            athleteView.show();
        }
    }
}
