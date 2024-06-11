package practicetask9;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

class ProfileScene {
    Stage stage;

    public ProfileScene(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Rectangle box = new Rectangle(620, 420);
        box.setFill(Color.web("#FFB4B4"));
        box.setX(40);
        box.setY(40);
        box.setArcWidth(50);
        box.setArcHeight(50);

        Label nama = new Label("Nama");
        nama.setFont(Font.font("Times New Roman", 20));
        nama.setLayoutX(60);
        nama.setLayoutY(55);
        nama.setTextFill(Color.WHITE);
        TextField tNama = new TextField();
        tNama.setPrefWidth(575);
        tNama.setLayoutX(60);
        tNama.setLayoutY(80);
        tNama.setStyle("-fx-background-radius: 20; -fx-border-radius: 20;");

        Label nim = new Label("NIM");
        nim.setFont(Font.font("Times New Roman", 20));
        nim.setLayoutX(60);
        nim.setLayoutY(120);
        nim.setTextFill(Color.WHITE);
        TextField tNim = new TextField();
        tNim.setPrefWidth(575);
        tNim.setLayoutX(60);
        tNim.setLayoutY(145);
        tNim.setStyle("-fx-background-radius: 20; -fx-border-radius: 20;");

        Button buton = new Button("NEXT");
        buton.setMaxHeight(30);
        buton.setPrefWidth(70);
        buton.getStyleClass().add("homie");
        buton.setOnAction(e -> {
            if(tNama.getText().trim().isEmpty()) {
                return;
            } else {
                DataScene pro = new DataScene(stage);
                pro.setNama(tNama.getText());
                pro.setNim(tNim.getText());
                pro.show();
            }
        });

        HBox boxx = new HBox(buton);
        boxx.setLayoutX(570);
        boxx.setLayoutY(410);

        AnchorPane gabung = new AnchorPane(box, nama, tNama, nim, tNim, boxx);
        gabung.setPadding(new Insets(10));
        gabung.setStyle("-fx-background-color: #B2A4FF;");
        gabung.getStylesheets().add(getClass().getResource("/style/Style.css").toExternalForm());
        stage.getScene().setRoot(gabung);
    }
}
