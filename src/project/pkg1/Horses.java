package project.pkg1;
public class Horses extends Species{

    private double speed;
    private String horseType;
    private double jumpHeight;

    //horse constructor

    public Horses(double speed, String horseType, double jumpHeight, String speciesBreed, String speciesName, String speciesRarity, String speciesSound, String foodGroup, String petName, int age, int energy, int food, String trait) {
        super(speciesBreed, speciesName, speciesRarity, speciesSound, foodGroup, petName, age, energy, food, trait);
        this.speed = speed;
        this.horseType = horseType;
        this.jumpHeight = jumpHeight;
    }


    /**
     * @return the speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }


    /**
     * @return the horseType
     */
    public String getHorseType() {
        return horseType;
    }

    /**
     * @param horseType the horseType to set
     */
    public void setHorseType(String horseType) {
        this.horseType = horseType;
    }


    /**
     * @return the jumpHeight
     */
    public Double getJumpHeight() {
        return jumpHeight;
    }

    /**
     * @param jumpHeight the jumpHeight to set
     */
    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    @Override
    public String getSpeciesSound() {
        if (speed > 50) {
            return "Wooooooooosh";
        } else {
            return super.getSpeciesSound();
        }
    }

}
