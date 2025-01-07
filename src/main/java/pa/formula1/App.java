package pa.formula1;

import pa.formula1.view.ConsoleView;
import pa.formula1.view.JavaFXView;
import pa.formula1.view.View;

import java.io.IOException;

public class App {

    private final View view;

    public App(View view) {
        this.view = view;
    }

    private static App createApp(String[] args) {
        return new App(new JavaFXView());
        // return new App(new ConsoleView());
    }

    private void startApp() throws IOException {
        view.open();
    }

    public static void main(String[] args) throws IOException {
        createApp(args).startApp();
    }

}
