package pa.formulaRacing;

import pa.formulaRacing.view.JavaFXView;
import javafx.application.Application;

public class App {
    public static void main(String[] args) {
        try {
            // Launch the JavaFX application
            Application.launch(JavaFXView.class, args);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Failed to start the application.");
        }
    }
}
