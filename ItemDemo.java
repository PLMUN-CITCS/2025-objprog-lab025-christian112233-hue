class Item {
    String name;
    static int count = 0; // Static variable to count objects

    // Constructor
    Item(String name) {
        this.name = name;
        count++; // Increment count when an object is created
    }

    void display() {
        System.out.println("Item: " + name);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        item1.display();
        item2.display();
        item3.display();

        System.out.println("Total objects created: " + Item.count);
    }
}
