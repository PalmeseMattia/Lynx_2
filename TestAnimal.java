package Lynx_2;

public class TestAnimal {
    public static void main(String[] args){
        Animal Zebra = new Animal("zebra", "bianco e nero", "pollo e topo", "leoni", 100, 4);
        Mammal cane = new Mammal("cane", "bianco, nero, marrone", "pollo e topo", "leoni", 100, 4, 20, 4);
        Reptilian serpente = new Reptilian("serpente", "bianco, nero, marrone", "pollo e topo", "carnivora", 5, 0, 10, 1, true);
        System.out.println(Zebra.toString());
        System.out.println(cane.toString());
        System.out.println(serpente.toString());
    }
}
