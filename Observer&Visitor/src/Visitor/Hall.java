package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Hall {
    private List<Element> rankingList = new ArrayList<Element>();

    public void addElement(Element element){
        rankingList.add(element);
    }

    public void show(RankingViewer rankingViewer){
        for (Element element : rankingList) {
            element.accept(rankingViewer);
        }
    }

}
