package DAO;

public class DaoTest {
    public static void main(String[] args) {//dao模式测试
        AthleteDao athleteDao = new AthleteDaoImpl();

        //输出所有的运动员
        for (Athlete athlete : athleteDao.getAllAthletes()) {
            System.out.println("编号 : "
                    + athlete.getRollNo() + ", 姓名 : " + athlete.getName());
        }


        //更新运动员
        Athlete athlete = athleteDao.getAllAthletes().get(0);
        athlete.setName("猴子");
        athleteDao.updateAthlete(athlete);

        //获取运动员
        athleteDao.getAthlete(0);
        System.out.println("编号 : "
                + athlete.getRollNo() + ", 姓名 : " + athlete.getName());
    }
}
