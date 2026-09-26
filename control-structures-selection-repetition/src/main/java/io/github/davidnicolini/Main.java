package io.github.davidnicolini;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Control Structures: Selection and Repetition");
            System.out.println("""        
                Choose an option:
                1 - Calculator;
                2 - Breakfast;
                3 - Coffee maker counter;
                0 - exit;
            """); 
            var chooice = scan.nextInt();

            switch (chooice) {
                case 1 -> {
                    System.out.println("Enter the first number: ");
                    double num1 = scan.nextDouble();
                    System.out.println("Enter the Operation (+, -, *, /):");
                    char operation = scan.next().charAt(0);
                    System.out.println("Enter the second number: ");
                    double num2 = scan.nextDouble();
                    double result = 0;
                    boolean validOperation = true;
                    switch (operation) {
                        case '+' -> result = num1 + num2;
                        case '-' -> result = num1 - num2;
                        case '*' -> result = num1 * num2;
                        case '/' -> {
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                System.out.println("Error: Division by zero!");
                                validOperation = false;
                            }
                        }
                        default -> {
                            System.out.println("Invalid operation!");
                            validOperation = false;
                        }
                    }
                    if (validOperation) {
                        System.out.println("The result is: " + result);
                    }
                }
                case 2 -> {
                    class menuItem {
                        String name;
                        double price;
                        
                        // Construtor
                        public menuItem(String name, double price) {
                            this.name = name;
                            this.price = price;
                        }
                    }   // Criando a lista de itens do cardápio
                    ArrayList<menuItem> menu = new ArrayList<>();
                    menu.add(new menuItem("Espresso", 5.50));
                    menu.add(new menuItem("Cheese Bread", 4.50));
                    menu.add(new menuItem("Fresh Sandwich", 12.00));
                    menu.add(new menuItem("Orange Juice", 7.00));
                    double billTotal = 0;
                    int option;
                    do {
                        System.out.println("\n=== INTERACTIVE MENU ===");
                        for (int i = 0; i < menu.size(); i++) {
                            System.out.printf("[%d] %s - R$ %.2f\n", (i + 1), menu.get(i).name, menu.get(i).price);
                        }
                        System.out.println("[0] Close account and log out");
                        System.out.print("Choose an option: ");
                        
                        option = scan.nextInt();
                        
                        if (option > 0 && option <= menu.size()) {
                            menuItem selectedItem = menu.get(option - 1);
                            billTotal += selectedItem.price;
                            System.out.println("-> " + selectedItem.name + " Added to the order!");
                        } else if (option != 0) {
                            System.out.println("Invalid option! Try again.");
                        }
                        
                    } while (option != 0);
                    System.out.printf("\n=== BILL CLOSED ===\n Total due: R$ %.2f\n Thank you for your patronage!\n", billTotal);
                }
                case 3 -> {
                    // 1. FOR: Used when you KNOW exactly how many times you will repeat.
                    System.out.println("=== 1. Preparing 3 Coffees (Loop FOR) ===");
                    for (int i = 1; i <= 3; i++) {
                        System.out.println("Cup number " + i + " ready!");
                    }   // 2. WHILE: Checks the condition BEFORE executing (it might not run at all if it is false)
                    System.out.println("\n=== 2. Serving Customers in Line (Loop WHILE) ===");
                    int customersInLine = 2;
                    while (customersInLine > 0) {
                        System.out.println("Customer served. Remaining: " + (customersInLine - 1));
                        customersInLine--; // Reduces the queue
                    }   // 3. DO-WHILE: Executes at least ONCE before checking the condition.
                    System.out.println("\n=== 3. Cleaning the Machine (Loop DO-WHILE) ===");
                    boolean dirtyMachine = false;
                    do {
                        System.out.println("Running mandatory cleaning cycle...");
                    } while (dirtyMachine);
                    // Even though 'dirtyMachine' was false, it ran the code above once.
                }
                default -> System.out.println("Log out");
            }
        }
    }
}