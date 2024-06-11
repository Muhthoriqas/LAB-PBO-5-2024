package practicetask9;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
// import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
// import javafx.scene.layout.HBox;
// import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

class HomeScene{
    Stage stage;

    public HomeScene(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Label label = new Label("Hi!");
        label.setTextFill(Color.WHITE);
        label.setFont(Font.font("Times New Roman", 30));
        label.setLayoutX(65);
        label.setLayoutY(400);

        Rectangle box = new Rectangle(620, 420);
        box.setFill(Color.web("#B2A4FF"));
        box.setX(40);
        box.setY(40);
        box.setArcWidth(50);
        box.setArcHeight(50);

        Button button = new Button("Click Me!");
        button.setLayoutX(485);
        button.setLayoutY(50);
        button.setFont(Font.font("Times New Roman", 30));
        button.setStyle("-fx-background-color: #B2A4FF; -fx-text-fill: #FFFFFF; -fx-background-radius: 50px;");
        button.setOnAction(e -> {
                ProfileScene pro = new ProfileScene(stage);
                pro.show();
        });

        AnchorPane tes = new AnchorPane(box, label, button);
        tes.setPadding(new Insets(50));
        tes.setStyle("-fx-background-color: #FFB4B4;");
        stage.getScene().setRoot(tes);

    }
}
