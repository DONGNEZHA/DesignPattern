package Test;

import Visitor.Audience;
import Visitor.Hall;
import Visitor.RankingList;
import Visitor.RankingViewer;

public class VisitorTest {
    public static void main(String[] args) {
        Hall hall = new Hall();
        //添加模拟运动员排名信息
        hall.addElement(new RankingList("百米赛跑","兔子",1));

        RankingViewer audience = new Audience();
        //观众访问大厅
        hall.show(audience);

        ((Audience)audience).getCertainItem();
        ((Audience)audience).getCertainName();
        ((Audience)audience).getCertainRanking();


    }
}
