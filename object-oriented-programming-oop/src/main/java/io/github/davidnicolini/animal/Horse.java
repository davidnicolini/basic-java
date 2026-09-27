package io.github.davidnicolini.animal;

public class Horse extends Animal{
 
    public Horse (String name, int yersOld){
        super.setName(name);
        super.setYersOld(yersOld);
    }
    @Override
    public void movesAround() {
        System.out.println("Horse: " + super.getName());
        System.out.println("YersOld: " + super.getYersOld());
        System.out.println("Gallops, performs the marching gait, and trots.");
    }

    @Override
    public void emitsSound() {
       System.out.println("Nhiiiiii ri ri rin!");
    }
    
}

