package Lynx_2;

class Mammal extends Animal{
    private int childs;
    private int gestation;


    public Mammal(String name, String colors, String predators, String diet, int weigth, int legs, int childs, int gestation) {
        super(name, colors, predators, diet, weigth,legs);
        this.childs = childs;
        this.gestation = gestation;
    }


    public int getChilds() {
        return this.childs;
    }

    public void setChilds(int childs) {
        this.childs = childs;
    }

    public int getGestation() {
        return this.gestation;
    }

    public void setGestation(int gestation) {
        this.gestation = gestation;
    }

    public String toString(){

        return(super.toString()
        + "\nnumero medio cuccioli: " + this.getChilds()
        +"\nmesi di gestazione:" + this.getGestation());
    }


}