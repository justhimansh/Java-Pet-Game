package project.pkg1;
public class Dogs extends Species{
    private boolean colorblind;
    private int biteStrength;
    private int senseOfSmell;

    public Dogs(boolean colorblind, int biteStrength, int senseOfSmell, String speciesBreed, String speciesName, String speciesRarity, String speciesSound, String foodGroup, String petName, int age, int energy, int food, String trait) {
        super(speciesBreed, speciesName, speciesRarity, speciesSound, foodGroup, petName, age, energy, food, trait);
        this.colorblind = colorblind;
        this.biteStrength = biteStrength;
        this.senseOfSmell = senseOfSmell;
    }

    /**
     * @return the senseOfSmell
     */
    public int getSenseOfSmell() {
        return senseOfSmell;
    }

    /**
     * @param senseOfSmell the senseOfSmell to set
     */
    public void setSenseOfSmell(int senseOfSmell) {
        this.senseOfSmell = senseOfSmell;
    }

    /**
     * @return the colorblind
     */
    public boolean colorblind() {
        return colorblind;
    }

    /**
     * @param colorblind the colorblind to set
     */
    public void setColorblind(boolean colorblind) {
        this.colorblind = colorblind;
    }

    /**
     * @return the biteStrength
     */
    public int getBiteStrength() {
        return biteStrength;
    }

    /**
     * @param biteStrength the biteStrength to set
     */
    public void setBiteStrength(int biteStrength) {
        this.biteStrength = biteStrength;
    }

    /**
     * Returns the sound that this dog makes.
     * If the dog is colorblind, it will bark twice. Otherwise, it will make the species sound.
     *
     * @return the sound that this dog makes.
     */
    @Override
    public String getSpeciesSound() {
        if (colorblind) {
            return "Bark! Bark!";
        } else {
            return super.getSpeciesSound();
        }
    }
}


