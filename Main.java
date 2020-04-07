package academy.learnProgramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList grocerylist = new GroceryList();

    public static void main(String[] args) {
        boolean quit = true;
        int position;
        printInstruction();
        while (quit) {

            System.out.println("Please enter the position");
            position = scanner.nextInt();
            scanner.nextLine();

            switch (position) {

                case 0:
                    System.out.println("Print Instructions");
                    printInstruction();
                    break;
                case 1:
                    System.out.println("Diplay grocery list");
                    displayMyGroceryList();
                    break;

                case 2:
                    System.out.println("Diplay grocery list");
                    addGroceryItem();
                    quit = true;
                    break;
                case 3:
                    System.out.println("Update the list :");
                    updateGrocery();
                    quit = true;
                    break;
                case 4:
                    System.out.println("Remove grocery Item");
                    removeGrocery();
                    quit = true;
                    break;
                case 5:
                    System.out.println("Search grocery Item");
                    searchGrocery();
                    quit = true;
                    break;
                case 6:
                    System.out.println("quit grocery shop");
                    quit = false;
            }

        }
    }

    private static void printInstruction() {
        System.out.println("\n 0 - Print the grocery list");
        System.out.println("\t 1 - Display the grocery list items");
        System.out.println("\t 2 - Add the grocery list");
        System.out.println("\t 3 - Update the grocery list");
        System.out.println("\t 4 - Remove the grocery list");
        System.out.println("\t 5 - search the grocery list");
        System.out.println("\t 6 - Quit the grocery list");
    }

    private static void displayMyGroceryList() {
        grocerylist.displayGroceryList();
    }

    private static void addGroceryItem() {
        System.out.println("Please add the grocery item here ...");
        String item = scanner.nextLine();
        if (grocerylist.isItemAdded(item)) {
            System.out.println("item is added successfully ...");
        } else{
                System.out.println("Already exists so we cannot add it now");
            }

        }

                private static void updateGrocery(){
                 System.out.println("Enter the item to update ...");
                    String item = scanner.nextLine();
                    scanner.nextLine();
                    if(grocerylist.isUpdateItem(item)){
                        System.out.println("item is replaced");
                    }else{
                        System.out.println("cannot be replaced");
                    }
}

    private static void removeGrocery(){
        System.out.println("Enter the item to update ...");
        String item = scanner.nextLine();
        scanner.nextLine();
        if(grocerylist.isItemRemoved(item)){
            System.out.println("Item successfully added in grocery list");
        }else{
            System.out.println("item is not present");
        }
    }

    private static void searchGrocery(){
        System.out.println("do you want to search grocery item ...");
        String item = scanner.nextLine();
        scanner.nextLine();
        if(grocerylist.isFindItem(item)){
            System.out.println("Item is " + item + "  Present");
        }else {
            System.out.println("Item is not present");
        }
    }



















}



