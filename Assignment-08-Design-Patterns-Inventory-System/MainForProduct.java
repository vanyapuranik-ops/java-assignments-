import java.util.Iterator;

public class MainForProduct 
{
    public static void main(String[] args) 
    {
        // get singleton instance
        InventoryManager manager = InventoryManager.getInstance();

        // add new products
        manager.addProduct(new NewProduct("Laptop"));
        manager.addProduct(new NewProduct("Mobile"));

        // add legacy products via adapter
        LegacyItem old1 = new LegacyItem(101, "Old Keyboard");
        LegacyItem old2 = new LegacyItem(102, "Old Monitor");

        manager.addProduct(new ProductAdapter(old1));
        manager.addProduct(new ProductAdapter(old2));

        // iterate using iterator
        Iterator<Product> iterator = manager.returnInventory();

        System.out.println("---- Inventory Details ----");

        while (iterator.hasNext()) 
        {
            Product p = iterator.next();
            p.displayDetails();
        }
    }
}
