package io.github.davidnicolini.animal;

public class Sloth extends Animal {
    public Sloth(String name, int yersOld){
        super.setName(name);
        super.setYersOld(yersOld);
    }
    @Override
    public void movesAround() {
        System.out.println("Sloth: " + super.getName());
        System.out.println("YersOld: " + super.getYersOld());
        System.out.println("Climb trees.");
    }

    @Override
    public void emitsSound() {
       System.out.println("GRRRRRRrrrrrrr!");
    }
}
