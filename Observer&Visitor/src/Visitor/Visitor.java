package Visitor;

public class Visitor {

    public static void main(String[] args) {
        Hall hall = new Hall();

        hall.addElement(new RankingList("百米赛跑","兔子",1));

        RankingViewer audience = new Audience();

        hall.show(audience);

        ((Audience)audience).getCertainItem();
        ((Audience)audience).getCertainName();
        ((Audience)audience).getCertainRanking();


    }
}
