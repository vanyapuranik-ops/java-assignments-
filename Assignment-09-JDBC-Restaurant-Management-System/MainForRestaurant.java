public class MainForRestaurant {

    public static void main(String[] args) {

        RestaurantDAO rdao = new RestaurantDAO();
        MenuItemDAO mdao = new MenuItemDAO();

        // -------------------------------
        System.out.println("\n===== STEP 1: INSERT DATA =====");
        // -------------------------------
        rdao.insertRestaurants();
        mdao.insertMenuItems();

        // -------------------------------
        System.out.println("\n===== STEP 2: DISPLAY ALL MENU ITEMS =====");
        // -------------------------------
        mdao.displayAll();

        // -------------------------------
        System.out.println("\n===== STEP 3: SELECT ITEMS WITH PRICE <= 100 =====");
        // -------------------------------
        mdao.selectPriceLessThan100();

        // -------------------------------
        System.out.println("\n===== STEP 4: SELECT ITEMS FROM 'Cafe Java' =====");
        // -------------------------------
        mdao.selectFromCafeJava();

        // -------------------------------
        System.out.println("\n===== STEP 5: UPDATE PRICE <= 100 TO 200 =====");
        // -------------------------------
        mdao.updatePrice();
        mdao.displayAll();

        // -------------------------------
        System.out.println("\n===== STEP 6: DELETE ITEMS STARTING WITH 'P' =====");
        // -------------------------------
        mdao.deleteByName();
        mdao.displayAll();

        // -------------------------------
        System.out.println("\n===== ALL OPERATIONS COMPLETED =====");
        // -------------------------------
    }
}
