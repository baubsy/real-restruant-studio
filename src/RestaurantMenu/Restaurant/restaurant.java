package RestaurantMenu.Restaurant;

public class restaurant {
    public static void main(String[] args) {
    MenuItem spaghetti = new MenuItem("Spaghetti", "Spahetti","Main Course", 10.00);
    Menu restaurantMenu = new Menu();

    restaurantMenu.addItem(spaghetti);

        System.out.println(spaghetti.toString());
        System.out.println(restaurantMenu.toString());
    }
    public static void main(){


    }
}
