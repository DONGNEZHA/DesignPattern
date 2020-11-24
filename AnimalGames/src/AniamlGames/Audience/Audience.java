package AniamlGames.Audience;

//  @program: AnimalGame
//  @description: A basic class about audience
//  @author: Xinyu Cui
//  @create: 2020/11/12

public abstract class Audience implements Cloneable {

    private String id;
    protected String type;

    protected abstract void printRace();

    protected String sex;      //Sex of Audience
    protected int age;      //Age of Audience
    protected String race;  //Race of Audience
    public String color;    //Color of Audience

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRace(){
        return race;
    }

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
