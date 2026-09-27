package io.github.davidnicolini.animal;

public abstract class  Animal {
    private String name;
    private int yersOld;
    public abstract void movesAround();
    public abstract void emitsSound();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYersOld() {
        return yersOld;
    }
    public void setYersOld(int yersOld) {
        this.yersOld = yersOld;
    }
    
}
