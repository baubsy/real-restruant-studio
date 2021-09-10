package RestruantMenu.Restruant;

public class MenuItem {
    private String category;
    private double price;
    private String description;
    private String name;

    public MenuItem(String name, String description, String category, double price){
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
    }

}
