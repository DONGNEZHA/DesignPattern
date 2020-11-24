package Proxy;

public class ProxyScoreSheet implements ScoreSheet {

    private RealScoreSheet realScoreSheet;

    @Override
    public void printScoreSheet() {
        if (realScoreSheet == null) {
            this.realScoreSheet = new RealScoreSheet();
        }
        System.out.println("打印中...");
        realScoreSheet.printScoreSheet();
        System.out.println("完成！");
    }
}
