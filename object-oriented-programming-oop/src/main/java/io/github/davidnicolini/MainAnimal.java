package io.github.davidnicolini;

import java.util.Scanner;


import io.github.davidnicolini.animal.Animal;
import io.github.davidnicolini.animal.Dog;
import io.github.davidnicolini.animal.Horse;
import io.github.davidnicolini.animal.Sloth;

public class MainAnimal {
    Animal animals[] = new Animal[30];
    
    static int size=0;

    
    public static void main(String[] args) {
        int option = 0;
        Scanner scan = new Scanner(System.in);
        
        MainAnimal mainAnimal = new MainAnimal();
        while(option!=3){
            System.out.println("""
                    Enter the desired option:
                    1 - Register;
                    2 - List;
                    3 - Exit;
                    """);
                    option = scan.nextInt();
                    switch(option){
                        case 1 -> {mainAnimal.animalRegister();}
                        case 2 -> {mainAnimal.listAnimals();}
                        case 3 -> {System.out.println("Leaving...");}
                        default -> {System.out.println("Invalid Option!");}
                    }
        }

    }
    
    public void animalRegister(){
        Scanner scan = new Scanner(System.in);

            System.out.println("""
                Enter the type of animal:
                1 - Dog;
                2 - Horse;
                3 - Sloth;

            """);
                int animal = scan.nextInt();
            scan.nextLine();
            
            if (animal==1 || animal==2 || animal==3) {
                System.out.println("Enter the animal's name: ");
                String name = scan.nextLine();

                System.out.println("Enter the Animal's Yers Old: ");
                int yersOld = scan.nextInt();

                if(animal==1){
                    animals[size] = new Dog(name, yersOld);
                }else if(animal==2){
                    animals[size] = new Horse(name, yersOld);
                }else if(animal==3){
                    animals[size] = new Sloth(name, yersOld);
                }
                size++;
            }
    }
    public void listAnimals(){
        Scanner scan = new Scanner(System.in);
        for (int animal=0; animal<size; animal++){
            System.out.println("nimal code: " + animal);
            animals[animal].movesAround();
        }
        System.out.println("Enter the code of the animal you wish to see.");
        int code = scan.nextInt();

        animals[code].movesAround();
        animals[code].emitsSound();
    }
}