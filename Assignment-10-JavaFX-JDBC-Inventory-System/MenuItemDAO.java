import java.sql.*;

public class MenuItemDAO 
{
    // INSERT 10 RECORDS
    public String insertMenuItems() 
    {
        StringBuilder result = new StringBuilder();
        String sql = "INSERT INTO MenuItem VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) 
        {
            for (int i = 1; i <= 10; i++) 
            {
                ps.setInt(1, i);
                ps.setString(2, (i % 2 == 0) ? "Pizza_" + i : "Burger_" + i);
                ps.setInt(3, i * 50);
                ps.setInt(4, (i % 3) + 1);
                ps.executeUpdate();
            }

            result.append("Inserted 10 MenuItem records.\n");
        } 
        catch (SQLException e) 
        {
            result.append("Error inserting menu items: ").append(e.getMessage());
        }

        return result.toString();
    }

    // FORMAT RESULTSET INTO STRING
    private String formatResultSet(ResultSet rs) throws SQLException 
    {
        StringBuilder output = new StringBuilder();
        ResultSetMetaData meta = rs.getMetaData();
        int cols = meta.getColumnCount();

        // Header
        for (int i = 1; i <= cols; i++) 
            {
            output.append(meta.getColumnName(i)).append("\t");
        }
        output.append("\n");

        // Rows
        while (rs.next()) 
        {
            for (int i = 1; i <= cols; i++) 
            {
                output.append(rs.getString(i)).append("\t");
            }
            output.append("\n");
        }

        return output.toString();
    }

    // SELECT price <= 100
    public String selectPriceLessThan100() 
    {
        StringBuilder result = new StringBuilder();
        String sql = "SELECT * FROM MenuItem WHERE Price <= 100";

        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)) 
        {
            result.append("\n--- MenuItems with Price <= 100 ---\n");
            result.append(formatResultSet(rs));

        } 
        catch (SQLException e) 
        {
            result.append("Error: ").append(e.getMessage());
        }

        return result.toString();
    }

    // SELECT items from Cafe Java
    public String selectFromCafeJava() 
    {
        StringBuilder result = new StringBuilder();

        String sql = "SELECT m.* FROM MenuItem m " +
                     "JOIN Restaurant r ON m.ResId = r.Id " +
                     "WHERE r.Name = 'Cafe Java'";

        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)) 
        {
            result.append("\n--- Items from Cafe Java ---\n");
            result.append(formatResultSet(rs));

        } 
        catch (SQLException e) 
        {
            result.append("Error: ").append(e.getMessage());
        }

        return result.toString();
    }

    // UPDATE price <= 100 → 200
    public String updatePrice() 
    {
        StringBuilder result = new StringBuilder();
        String sql = "UPDATE MenuItem SET Price = 200 WHERE Price <= 100";

        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement()) 
        {
            int rows = st.executeUpdate(sql);
            result.append("Updated rows: ").append(rows).append("\n");
        } 
        catch (SQLException e) 
        {
            result.append("Error: ").append(e.getMessage());
        }

        return result.toString();
    }

    // DELETE where name starts with P
    public String deleteByName() 
    {
        StringBuilder result = new StringBuilder();
        String sql = "DELETE FROM MenuItem WHERE Name LIKE 'P%'";

        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement()) 
        {
            int rows = st.executeUpdate(sql);
            result.append("Deleted rows: ").append(rows).append("\n");
        } 
        catch (SQLException e) 
        {
            result.append("Error: ").append(e.getMessage());
        }

        return result.toString();
    }

    // DISPLAY ALL
    public String displayAll() 
    {
        StringBuilder result = new StringBuilder();
        String sql = "SELECT * FROM MenuItem";

        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)) 
        {
            result.append("\n--- All MenuItems ---\n");
            result.append(formatResultSet(rs));

        } 
        catch (SQLException e) 
        {
            result.append("Error: ").append(e.getMessage());
        }

        return result.toString();
    }
}
