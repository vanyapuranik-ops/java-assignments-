import java.sql.*;

public class RestaurantDAO 
{
    public void insertRestaurants() 
    {
        String sql = "INSERT INTO Restaurant VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) 
        {
            for (int i = 1; i <= 10; i++) 
            {
                ps.setInt(1, i);
                ps.setString(2, (i == 1) ? "Cafe Java" : "Restaurant_" + i);
                ps.setString(3, "Address_" + i);
                ps.executeUpdate();
            }

            System.out.println("Inserted 10 Restaurant records.");
        } 
        catch (SQLException e) 
        {
            System.out.println("Error inserting restaurants: " + e.getMessage());
        }
    }
}
