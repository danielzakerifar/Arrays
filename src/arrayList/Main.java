package arrayList;

import java.util.ArrayList;
import java.util.Scanner;
/*
 *
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quite = false;
        int choice = 0;
        printInstructions();
        while(!quite) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quite = true;
                    break;

            }
        }
    }

    private static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

    public static void printInstructions() {
        System.out.println("/n press ");
        System.out.println("1:print all the items in the list ");
        System.out.println("2:add item in to the list ");
        System.out.println("3: modify the Item ");
        System.out.println("4: remove the Item ");
        System.out.println("5: searchForItem ");
        System.out.println("6:quite");

    }
    public static void addItem () {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter item number : ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem( itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item number : ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if
        (groceryList.onFile(searchItem)) {
            System.out.println("Found" + searchItem + "in out grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}
