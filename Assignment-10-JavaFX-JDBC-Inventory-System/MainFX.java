import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainFX extends Application
{
    MenuItemDAO mdao = new MenuItemDAO();
    RestaurantDAO rdao = new RestaurantDAO();

    TextArea outputArea = new TextArea();

    @Override
    public void start(Stage stage) 
    {
        // buttons
        Button insertBtn = new Button("Insert Data");
        Button selectBtn = new Button("Select Queries");
        Button updateBtn = new Button("Update Data");
        Button deleteBtn = new Button("Delete Data");

        // actions
        insertBtn.setOnAction(e -> insertData());
        selectBtn.setOnAction(e -> selectData());
        updateBtn.setOnAction(e -> updateData());
        deleteBtn.setOnAction(e -> deleteData());

        VBox layout = new VBox(10, insertBtn, selectBtn, updateBtn, deleteBtn, outputArea);
        layout.setPadding(new Insets(15));

        Scene scene = new Scene(layout, 500, 400);
        stage.setTitle("Inventory Management System (JavaFX)");
        stage.setScene(scene);
        stage.show();
    }

    // ---------------- INSERT ----------------
    private void insertData() 
    {
        rdao.insertRestaurants();
        mdao.insertMenuItems();
        outputArea.setText("Inserted records successfully.");
    }

    // ---------------- SELECT ----------------
    private void selectData() 
    {
        outputArea.setText("Check console for results.\n");
        mdao.selectPriceLessThan100();
        mdao.selectFromCafeJava();
    }

    // ---------------- UPDATE ----------------
    private void updateData() 
    {
        mdao.updatePrice();
        outputArea.setText("Updated records where price <= 100.");
    }

    // ---------------- DELETE ----------------
    private void deleteData() 
    {
        mdao.deleteByName();
        outputArea.setText("Deleted items starting with 'P'.");
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}
