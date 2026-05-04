import java.util.*;

public class InventoryManager 
{
    // singleton instance
    private static InventoryManager instance;

    // list of products
    private List<Product> productList;

    // private constructor
    private InventoryManager() 
    {
        productList = new ArrayList<>();
    }

    // global access point
    public static InventoryManager getInstance() 
    {
        if (instance == null) 
        {
            instance = new InventoryManager();
        }
        return instance;
    }

    // Add product
    public void addProduct(Product product) 
    {
        productList.add(product);
    }

    // Return iterator
    public Iterator<Product> returnInventory() 
    {
        return productList.iterator();
    }
}
