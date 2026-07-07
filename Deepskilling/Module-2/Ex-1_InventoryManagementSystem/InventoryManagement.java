import java.util.HashMap;

public class InventoryManagement {

    HashMap<Integer, Product> inventory = new HashMap<>();

    
    public void addProduct(Product p) {
        inventory.put(p.productId, p);
        System.out.println("Product Added");
    }

    
    public void updateProduct(int id, String name, int qty, double price) {

        if (inventory.containsKey(id)) {

            Product p = inventory.get(id);

            p.productName = name;
            p.quantity = qty;
            p.price = price;

            System.out.println("Product Updated");

        } else {
            System.out.println("Product Not Found");
        }
    }


    public void deleteProduct(int id) {

        if (inventory.containsKey(id)) {

            inventory.remove(id);
            System.out.println("Product Deleted");

        } else {
            System.out.println("Product Not Found");
        }
    }

    
    public void displayProducts() {

        for (Product p : inventory.values()) {
            p.display();
        }
    }

    public static void main(String[] args) {

        InventoryManagement obj = new InventoryManagement();

        Product p1 = new Product(101, "Laptop", 10, 55000);
        Product p2 = new Product(102, "Mouse", 30, 500);
        Product p3 = new Product(103, "Keyboard", 20, 1200);

        obj.addProduct(p1);
        obj.addProduct(p2);
        obj.addProduct(p3);

        System.out.println("\nInventory");
        obj.displayProducts();

        obj.updateProduct(102, "Wireless Mouse", 40, 800);

        System.out.println("\nAfter Update");
        obj.displayProducts();

        obj.deleteProduct(101);

        System.out.println("\nAfter Delete");
        obj.displayProducts();
    }
}