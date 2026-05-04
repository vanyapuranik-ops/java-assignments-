public class ProductAdapter implements Product
{
    private LegacyItem legacyItem;

    public ProductAdapter(LegacyItem legacyItem) 
    {
        this.legacyItem = legacyItem;
    }

    @Override
    public void displayDetails() 
    {
        // adapting old method to new interface
        legacyItem.print();
    }
}
