package Strategy;

public class OneThousandMetersRunning extends ProjectSelect {

    @Override
    public double selectProject(double speed,double physical,double strength,double skill) {
        double value = speed*1.1+physical*1.3+strength*1+skill*1.2;
        double time = value * 0.411288;
        return time;
    }
}
