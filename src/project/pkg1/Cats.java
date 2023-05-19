package project.pkg1;
public class Cats extends Species{

    // declare class variables
    private int nightVision;
    private String color;
    private boolean hasClaws;

    // constructor for Cats class
    public Cats(int nightVision, String color, boolean hasClaws, String speciesBreed, String speciesName, String speciesRarity, String speciesSound, String foodGroup, String petName, int age, int energy, int food, String trait) {
        // call constructor of superclass Species
        super(speciesBreed, speciesName, speciesRarity, speciesSound, foodGroup, petName, age, energy, food, trait);
        // set the values of class variables
        this.nightVision = nightVision;
        this.color = color;
        this.hasClaws = hasClaws;
    }

    /**
     * @return the hasClaws
     */
    public boolean HasClaws() {
        return hasClaws;
    }

    /**
     * @param hasClaws the hasClaws to set
     */
    public void setHasClaws(boolean hasClaws) {
        this.hasClaws = hasClaws;
    }

    /**
     * @return the nightvision
     */
    public int getNightVision() {
        return nightVision;
    }

    /**
     * @param nightVision the hasClaws to set
     */
    public void setNightVision(int nightVision) {
        this.nightVision = nightVision;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    // override the getSpeciesSound method in the superclass Species
    @Override
    public String getSpeciesSound() {
        // check if cat has claws
        if (hasClaws == false) {
            return "meewwwww"; // return "meewwwww" if cat doesn't have claws
        } else {
            return super.getSpeciesSound(); // call the getSpeciesSound method of the superclass Species if cat has claws
        }
    }

}
