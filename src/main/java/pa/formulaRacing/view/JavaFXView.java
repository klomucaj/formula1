package pa.formulaRacing.view;

import pa.formulaRacing.controller.DefaultMasterController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Implementazione di una vista con JavaFX.
 */
public class JavaFXView extends Application implements View {

    DefaultMasterController controller = new DefaultMasterController();

    @Override
    public void open() {
        Application.launch(this.getClass());
    }

    @Override
    public void close() {

    }

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML file
            Parent root = FXMLLoader.load(getClass().getResource("/start.fxml"));

            // Set up the stage and scene
            primaryStage.setTitle("Formula Racing Game");
            primaryStage.setScene(new Scene(root, 800, 600));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to load the F1.fxml file. Ensure the file path is correct.");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("An unexpected error occurred during application initialization.");
        }
    }
}
