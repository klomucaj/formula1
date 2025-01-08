module pa.formulaRacing {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.desktop;
    requires javafx.graphics;


    opens pa.formulaRacing to javafx.fxml;
    opens pa.formulaRacing.view to javafx.fxml;
    exports pa.formulaRacing.view to javafx.graphics;
    exports pa.formulaRacing;

}