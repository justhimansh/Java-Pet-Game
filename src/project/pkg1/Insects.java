package project.pkg1;

public class Insects extends Species{

    private int Legs;
    private boolean isVenomous;
    private int Eyes;

    //insect constructor

    public Insects(int Legs, boolean isVenomous, int Eyes, String speciesBreed, String speciesName, String speciesRarity, String speciesSound, String foodGroup, String petName, int age, int energy, int food, String trait) {
        super(speciesBreed, speciesName, speciesRarity, speciesSound, foodGroup, petName, age, energy, food, trait);
        this.Legs = Legs;
        this.isVenomous = isVenomous;
        this.Eyes = Eyes;
    }

    /**
     * @return the isVenomous
     */
    public boolean isIsVenomous() {
        return isVenomous;
    }

    /**
     * @param isVenomous the isVenomous to set
     */
    public void setIsVenomous(boolean isVenomous) {
        this.isVenomous = isVenomous;
    }

    /**
     * @return the canFly
     */
    public int Eyes() {
        return Eyes;
    }

    /**
     * @param canFly the canFly to set
     */
    public void setEye(int Eyes) {
        this.Eyes = Eyes;
    }

    public int Legs() {
        return Legs;
    }

    /**
     * @param canFly the canFly to set
     */
    public void setLegs(int Legs) {
        this.Legs = Legs;
    }

    @Override
    public String getSpeciesSound() {
        if (isVenomous == true) {
            return "Screeeech";
        } else {
            return super.getSpeciesSound();
        }
    }
}
