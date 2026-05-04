import java.sql.*;

public class MenuItemDAO 
{
    // insert 10 records
    public void insertMenuItems() 
    {
        String sql = "INSERT INTO MenuItem VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) 
        {
            for (int i = 1; i <= 10; i++) 
            {
                ps.setInt(1, i);
                ps.setString(2, (i % 2 == 0) ? "Pizza_" + i : "Burger_" + i);
                ps.setInt(3, (i * 50)); // prices: 50,100,150...
                ps.setInt(4, (i % 3) + 1); // link to restaurants
                ps.executeUpdate();
            }

            System.out.println("Inserted 10 MenuItem records.");
        } 
        catch (SQLException e) 
        {
            System.out.println("Error inserting menu items: " + e.getMessage());
        }
    }

    // print ResultSet in table format
    private void printResultSet(ResultSet rs) throws SQLException 
    {
        ResultSetMetaData meta = rs.getMetaData();
        int cols = meta.getColumnCount();

        for (int i = 1; i <= cols; i++) 
        {
            System.out.print(meta.getColumnName(i) + "\t");
        }
        System.out.println();

        while (rs.next()) 
        {
            for (int i = 1; i <= cols; i++) 
            {
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }
    }

    // select price <= 100
    public void selectPriceLessThan100() 
    {
        String sql = "SELECT * FROM MenuItem WHERE Price <= 100";

        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)) 
        {
            System.out.println("\n--- MenuItems with Price <= 100 ---");
            printResultSet(rs);
        } 
        catch (SQLException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // select items from Cafe Java
    public void selectFromCafeJava() 
    {
        String sql = "SELECT m.* FROM MenuItem m JOIN Restaurant r ON m.ResId = r.Id WHERE r.Name = 'Cafe Java'";

        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)) 
        {
            System.out.println("\n--- Items from Cafe Java ---");
            printResultSet(rs);
        } 
        catch (SQLException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // update
    public void updatePrice() 
    {
        String sql = "UPDATE MenuItem SET Price = 200 WHERE Price <= 100";

        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement()) 
        {
            int rows = st.executeUpdate(sql);
            System.out.println("\nUpdated rows: " + rows);
        } 
        catch (SQLException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // delete
    public void deleteByName() 
    {
        String sql = "DELETE FROM MenuItem WHERE Name LIKE 'P%'";

        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement()) 
        {
            int rows = st.executeUpdate(sql);
            System.out.println("\nDeleted rows: " + rows);
        } 
        catch (SQLException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // display all
    public void displayAll() 
    {
        String sql = "SELECT * FROM MenuItem";

        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)) 
        {
            System.out.println("\n--- All MenuItems ---");
            printResultSet(rs);
        } 
        catch (SQLException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
