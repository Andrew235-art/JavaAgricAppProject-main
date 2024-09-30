import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Agricultural App");

        Button btnAddCrop = new Button("Add Crop");
        Button btnListCrops = new Button("List Crops");

        VBox vbox = new VBox(btnAddCrop, btnListCrops);
        
        Scene scene = new Scene(vbox, 300, 200);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // Add event handlers for buttons
        btnAddCrop.setOnAction(e -> addCrop());
        btnListCrops.setOnAction(e -> listCrops());
    }

    private void addCrop() {
        // Logic to add a crop (could open a new window for input)
    }

    private void listCrops() {
        // Logic to display the list of crops
    }

    public static void main(String[] args) {
        launch(args);
    }
}