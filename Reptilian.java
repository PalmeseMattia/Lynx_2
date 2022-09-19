package Lynx_2;

class Reptilian extends Animal{
    private int numberOfEggs;
    private int weightOfEggs;
    private boolean teeths;

    Reptilian(String name, String colors, String predators, String diet, int weigth, int legs, int numberOfEggs, int weightOfEggs, boolean teeths){
        super(name, colors, predators, diet, weigth,legs);
        this.numberOfEggs = numberOfEggs;
        this.weightOfEggs = weightOfEggs;
        this.teeths = teeths;
    }

    public int getNumberOfEggs() {
        return this.numberOfEggs;
    }

    public void setNumberOfEggs(int numberOfEggs) {
        this.numberOfEggs = numberOfEggs;
    }

    public int getWeightOfEggs() {
        return this.weightOfEggs;
    }

    public void setWeightOfEggs(int weightOfEggs) {
        this.weightOfEggs = weightOfEggs;
    }

    public boolean isTeeths() {
        return this.teeths;
    }

    public boolean getTeeths() {
        return this.teeths;
    }

    public void setTeeths(boolean teeths) {
        this.teeths = teeths;
    }

    public String toString(){
        return(super.toString() +
        " ha" + getLegs() + "zampe.\n" +
        " depone" + getNumberOfEggs() + "uova.\n" +
        "le uova sono :" + getWeightOfEggs() + "uova.\n"
        );
    }
}
