package Proxy;

public class ProxyScoreSheet implements ScoreSheet {

    private RealScoreSheet realScoreSheet;

    @Override
    //打印成绩单
    public void printScoreSheet() {
        if (realScoreSheet == null) {
            this.realScoreSheet = new RealScoreSheet();
        }
        System.out.println("打印中...");
        realScoreSheet.printScoreSheet();
        System.out.println("成绩单打印完成！");
    }
}
