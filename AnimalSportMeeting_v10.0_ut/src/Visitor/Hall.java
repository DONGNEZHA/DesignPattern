package Visitor;

import java.util.ArrayList;
import java.util.List;

//大厅类
public class Hall {
    //排名列表
    public List<Element> rankingList = new ArrayList<Element>();

    //添加排名
    public void addElement(Element element) {
        rankingList.add(element);
    }

    //供排名查看者查看排名
    public void show(RankingViewer rankingViewer) {
        for (Element element : rankingList) {
            element.accept(rankingViewer);
        }
    }

}
