package io.github.davidnicolini.animal;

public class Dog extends Animal {
    public Dog (String name, int yersOld){
        super.setName(name);
        super.setYersOld(yersOld);
    }
    @Override
    public void movesAround() {
        System.out.println("Dog: " + super.getName());
        System.out.println("YersOld: " + super.getYersOld());
        System.out.println("runs on four legs and has a good sense of smell");
    }

    @Override
    public void emitsSound() {
       System.out.println("Au, Au!");
    }
    
}
