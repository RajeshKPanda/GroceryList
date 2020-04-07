import java.util.ArrayList;

public class GroceryList {
    private static ArrayList<String> groceryList = new ArrayList<String>();

    public static void addGroceryList(String groceryListName){
        groceryList.add(groceryListName);
    }

    public static void displayGroceryList() {

        if (groceryList.isEmpty()) {
            System.out.println("No item  to display");
        } else {
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println(groceryList.get(i));
                System.out.println("Items added successfully" + groceryList.toString());
            }

        }
    }
    public static boolean isFindItem(String item){
        return groceryList.contains(item);
    }

    public static int ItemPosition(String item){
        return groceryList.indexOf(item);
    }

    public static boolean isItemAdded(String item){
        if(isFindItem(item)){
              return false;
        }else {groceryList.add(item);
         return true;
        }

    }

    public static boolean isItemRemoved(String item){
        if(ItemPosition(item) >= 0){
            groceryList.remove(ItemPosition(item));
            System.out.println("Item " + groceryList.get(ItemPosition(item)) + " has been successfully removed ");
            return true;
        }
        return false;
    }

    public static boolean isUpdateItem(String item){
        int position = ItemPosition(item);
        if(position < 0){
            System.out.println("Item is not present and hence cannot be replaced");
            return false;
        }else{
            groceryList.set(position,item);
            return true;
        }
    }



}
