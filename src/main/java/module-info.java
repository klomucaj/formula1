module pa.formula1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.desktop;
    requires javafx.graphics;


    opens pa.formula1 to javafx.fxml;
    opens pa.formula1.view to javafx.graphics;
    exports pa.formula1;
    exports pa.formula1.view;
}