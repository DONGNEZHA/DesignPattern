package Visitor;

import java.util.Scanner;

public class Visitor {
    /*
    VisitorShowRank是查询指定项目中，某个动物的排名，依次输入项目，姓名，排名
    VisitorAddRank是把该项目的某个动物的排名添加到一个表中
    */
    Hall hall = new Hall();

    public void VisitorAddRank(String item, String name, int ranking) {
        hall.addElement(new RankingList(item, name, ranking));
    }

    public void VisitorShowRank() {
        Scanner scan = new Scanner(System.in);
        String name, item;
        //添加模拟运动员排名信息
        RankingList rankingList;
        RankingViewer audience = new Audience();
        //观众访问大厅
        System.out.println("请依次输入项目名，姓名");
        name = scan.next();
        item = scan.next();
        for (int i = 0; i < hall.rankingList.size(); i++) {
            rankingList = (RankingList) hall.rankingList.get(i);
            if (name.equals(rankingList.getName())) {
                if (item.equals(rankingList.getItem())) {
                    audience.view(rankingList);
                    break;
                }
            }
        }
        ((Audience) audience).getCertainItem();
        ((Audience) audience).getCertainName();
        ((Audience) audience).getCertainRanking();
    }
}
