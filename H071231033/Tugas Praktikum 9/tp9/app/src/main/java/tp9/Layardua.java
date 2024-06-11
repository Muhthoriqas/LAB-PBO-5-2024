package tp9;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorInput;
import javafx.scene.text.Font;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Layardua {
    Stage stage;

    public Layardua(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Label label1 = new Label("Muh Aryaputra Rafa");
        label1.setFont(Font.font("Arial", 20));
        label1.setTextFill(Color.BLACK);
        
        Label label2 = new Label("18");
        label2.setFont(Font.font("Arial", 10));
        label2.setTextFill(Color.BLACK);

        Button anu = new Button("Back");
        anu.setPrefWidth(100);
        anu.setBackground(new Background(new BackgroundFill(Color.DARKBLUE, new CornerRadii(10), null)));
        anu.setTextFill(Color.KHAKI);
        anu.setOnAction(e -> {
            Layarsatu first = new Layarsatu(stage);
            first.show();
        });

        Image image = new Image(getClass().getClassLoader().getResourceAsStream("image/rafa.jpg"));
        
        ImageView muncul = new ImageView(image);
        muncul.setFitWidth(100);
        muncul.setFitHeight(130);

        Color satu = Color.LIGHTBLUE;

        VBox turuu = new VBox(muncul, label1, label2, anu);
        turuu.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, CornerRadii.EMPTY, null)));
        turuu.setAlignment(Pos.CENTER);
        turuu.setSpacing(3);

        Scene torretto = new Scene(turuu, 500, 500, satu);
        stage.setScene(torretto);
        stage.show();
        

    }
    
}

