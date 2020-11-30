package SimpleFactory;

import State.AnimalState;

public class Athlete {
    private String AnimalName;
    private Race AnimalRace;
    private Color AnimalColor;
    private double speed;
    private double physical;
    private double strength;
    private double skill;
    private AnimalState animalState;
    private int[] Rank;
    private double[] Score;

    public Athlete() {
    }

    //构造函数（不会调用，仅作为比较）
    private Athlete(Race race, Color color) {
        AnimalRace = race;
        AnimalColor = color;
        AnimalName = AnimalColor.getColor() + AnimalRace.getRace();
        if (race.getRace() == "Cat") {
            speed = 106;
            physical = 96;
            strength = 94;
            skill = 104;
        } else if (race.getRace() == "Dog") {
            speed = 103;
            physical = 99;
            strength = 100;
            skill = 101;
        } else if (race.getRace() == "Bear") {
            speed = 98;
            physical = 104;
            strength = 99;
            skill = 108;
        }
    }

    //getter & stter
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getSkill() {
        return skill;
    }

    public void setSkill(double skill) {
        this.skill = skill;
    }

    public String getAnimalName() {
        return AnimalName;
    }

    public void setAnimalName(String animalName) {
        AnimalName = animalName;
    }

    public Color getAnimalColor() {
        return AnimalColor;
    }

    public void setAnimalColor(Color animalColor) {
        AnimalColor = animalColor;
    }

    public Race getAnimalRace() {
        return AnimalRace;
    }

    public void setAnimalRace(Race animalRace) {
        AnimalRace = animalRace;
    }

    public int[] getRank() {
        return Rank;
    }

    public void setRank(int[] rank) {
        Rank = rank;
    }

    public double[] getScore() {
        return Score;
    }

    public void setScore(double[] score) {
        Score = score;
    }

    public AnimalState getAnimalState() {
        return animalState;
    }

    public void setAnimalState(AnimalState animalState) {
        this.animalState = animalState;
    }

    //输出测试信息
    public void showAnimalInfo() {
        System.out.println("Name is " + AnimalName + "!");
        AnimalRace.getRace();
        AnimalColor.getColor();
    }

}
