package Lynx_2;

class Animal {
    private String name;
    private String colors;
    private String predators;
    private String diet;
    private int weigth;
    private int legs;

    Animal(String name, String colors, String predators, String diet, int weigth, int legs) {
        this.name = name;
        this.colors = colors;
        this.predators = predators;
        this.diet = diet;
        this.weigth = weigth;
        this.legs = legs;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColors() {
        return this.colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getPredators() {
        return this.predators;
    }

    public void setPredators(String predators) {
        this.predators = predators;
    }

    public String getDiet() {
        return this.diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public int getWeigth() {
        return this.weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getLegs() {
        return this.legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }


    public String toString() {
        return "Guida su " + getName() +":\n" +
            "di solito è di colore " + getColors() + "," +
            " i suoi predatori sono" + getPredators() + "," +
            " la sua dieta è composta da" + getDiet() + "," +
            " di solito pesa" + getWeigth() + " kg," +
            " ha" + getLegs() + "zampe.\n";
    }
    
}
