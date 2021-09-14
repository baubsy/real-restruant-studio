package RestaurantMenu.Restaurant;

public class restaurant {
    public static void main(String[] args) {
    MenuItem spaghetti = new MenuItem("Spaghetti", "Spaghetti","Main Course", 10);
    MenuItem iceCream = new MenuItem("Ice Cream", "choclate", "Dessert", 6);
    Menu restaurantMenu = new Menu();

    restaurantMenu.addItem(spaghetti);
    restaurantMenu.addItem(iceCream);

        System.out.println(spaghetti.toString());
        System.out.println(restaurantMenu.toString());
    }
    public static void main(){


    }
}
