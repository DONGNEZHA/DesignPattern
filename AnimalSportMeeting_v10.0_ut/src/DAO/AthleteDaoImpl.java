package DAO;

import java.util.ArrayList;
import java.util.List;

public class AthleteDaoImpl implements AthleteDao {

    //列表是当作一个数据库
    List<Athlete> athletes;

    //添加兔子和熊猫
    public AthleteDaoImpl() {
        athletes = new ArrayList<Athlete>();
        Athlete athlete1 = new Athlete("兔子", 0);
        Athlete athlete2 = new Athlete("熊猫", 1);
        athletes.add(athlete1);
        athletes.add(athlete2);
    }

    //删除
    @Override
    public void deleteAthlete(Athlete athlete) {
        athletes.remove(athlete.getRollNo());
        System.out.println("编号 " + athlete.getRollNo()
                + ", 数据库已删除");
    }

    //从数据库中检索运动员名单
    @Override
    public List<Athlete> getAllAthletes() {
        return athletes;
    }

    @Override
    public Athlete getAthlete(int rollNo) {
        return athletes.get(rollNo);
    }

    @Override
    public void updateAthlete(Athlete athlete) {
        athletes.get(athlete.getRollNo()).setName(athlete.getName());
        System.out.println("编号 " + athlete.getRollNo()
                + ", 数据库已更新");
    }
}