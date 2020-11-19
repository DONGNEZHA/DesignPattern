package Strategy;

public class FourHundredMetersSwimming extends ProjectSelect{

    @Override
    public double selectProject(double speed,double physical,double strength,double skill) {
        double value = speed*1.1+physical*1.2+strength*1+skill*1.3;
        double time = value * 0.5623183;
        return time;
    }
}
