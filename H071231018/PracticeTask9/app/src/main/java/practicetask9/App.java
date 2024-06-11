package practicetask9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application{
    public void start(Stage stage){
        stage.setTitle("Famei's App");
        Pane root = new Pane();
        Scene scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();

        HomeScene home = new HomeScene(stage);
        home.show();
    }

    public static void main(String[] args) {
        launch();
    }
}