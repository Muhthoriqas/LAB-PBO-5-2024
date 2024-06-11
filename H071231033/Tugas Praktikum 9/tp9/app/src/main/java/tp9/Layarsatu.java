package tp9;

// import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.CornerRadii;
// import javafx.scene.layout.Pane;
// import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import javafx.scene.Scene;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.layout.BackgroundFill;

public class Layarsatu{
    Stage stage;

    public Layarsatu(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Label plossa = new Label("Hello!!!");
        plossa.setFont(Font.font( "Comic Sans MS", 15));
        plossa.setTextFill(Color.BLACK);

        Label plossa2 = new Label("Welcome to Wee Page");
        plossa2.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        plossa2.setTextFill(Color.BLACK);

        Button aneh = new Button("About Me");
        aneh.setPrefWidth(150);
        aneh.setBackground(new Background(new BackgroundFill(Color.GREEN, new CornerRadii(10), null)));
        aneh.setTextFill(Color.KHAKI);
        aneh.setOnAction(e -> {
            Layardua kedua = new Layardua(stage);
            kedua.show();
        });  

        VBox huuu = new VBox(plossa, plossa2, aneh);
        huuu.setAlignment(Pos.CENTER);
        huuu.setSpacing(3);
        
        Scene monyongg = new Scene(huuu, 500, 500, Color.AQUA);
        stage.setScene(monyongg);
        stage.show();
    }
}