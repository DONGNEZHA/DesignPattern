package Strategy;

public class OneHundredMetersRunning extends ProjectSelect {

    @Override
    public double selectProject(double speed,double physical,double strength,double skill) {
        double value = speed*1.3+physical*1.1+strength*1+skill*1.2;
        double time = value * 0.027432;
        return time;
    }
}
