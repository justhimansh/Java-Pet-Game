package project.pkg1;
public class Birds extends Species{

    private String wingsSpan;
    private boolean canFly;
    private int flyingSpeed;

    // Bird class constructor
    public Birds(String wingsSpan, boolean canFly, int flyingSpeed, String speciesBreed, String speciesName, String speciesRarity, String speciesSound, String foodGroup, String petName, int age, int energy, int food, String trait) {
        super(speciesBreed, speciesName, speciesRarity, speciesSound, foodGroup, petName, age, energy, food, trait);
        this.wingsSpan = wingsSpan;
        this.canFly = canFly;
        this.flyingSpeed = flyingSpeed;
    }

    // Getters and Setters for wingsSpan and canFly
    public String getWingsSpan() {
        return wingsSpan;
    }

    public void setWingsSpan(String wingsSpan) {
        this.wingsSpan = wingsSpan;
    }

    public boolean getFlight() {
        return canFly;
    }

    public void setFlight(boolean canFly) {
        this.canFly = canFly;
    }

    // Getters and Setters for flyingSpeed
    public int getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(int flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    // Overrides the getSpeciesSound method to return "squeeek" if the bird cannot fly
    @Override
    public String getSpeciesSound() {
        if (canFly = false) {
            return "squeeek";
        } else {
            return super.getSpeciesSound();
        }
    }
}
