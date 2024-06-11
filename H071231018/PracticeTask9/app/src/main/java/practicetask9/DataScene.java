package practicetask9;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DataScene {
    private Stage stage;
    private String nama;
    private String nim;

    public DataScene(Stage stage) {
        this.stage = stage;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void show() {
        Image foto = new Image("image/profil.png");
        ImageView viewFoto = new ImageView(foto);
        viewFoto.setFitHeight(50);
        viewFoto.setFitWidth(100);
        viewFoto.setLayoutX(310);
        viewFoto.setLayoutY(80);

        Label b = new Label("DATA ANDA");
        b.setTextFill(Color.WHITE);
        b.setFont(Font.font("Times New Roman", 20));
        b.setLayoutX(302);
        b.setLayoutY(145);

        Rectangle boxxx = new Rectangle(620, 420);
        boxxx.setFill(Color.web("#B2A4FF"));
        boxxx.setX(40);
        boxxx.setY(40);
        boxxx.setArcWidth(50);
        boxxx.setArcHeight(50);

        Label lnama = new Label("Nama\t\t\t : " + nama);
        lnama.setPrefSize(400, 30);
        lnama.setFont(Font.font("Times New Roman", 15));
        lnama.setTextFill(Color.WHITE);
        // lnama.getStyleClass().add("label-hasil");

        Label lNim = new Label("NIM\t\t\t\t : " + nim);
        lNim.setPrefSize(400, 30);
        lNim.setFont(Font.font("Times New Roman", 15));
        lNim.setTextFill(Color.WHITE);

        // lNim.getStyleClass().add("label-hasil");

        VBox textVBox = new VBox(lnama, lNim);
        textVBox.setSpacing(10);
        textVBox.setLayoutX(60);
        textVBox.setLayoutY(190);

        Button back = new Button("BACK");
        back.getStyleClass().add("home");
        back.setMaxHeight(30);
        back.setPrefHeight(30);
        back.setLayoutX(65);
        back.setLayoutY(405);
        back.setOnAction(e -> {
            HomeScene home = new HomeScene(stage);
            home.show();
        });

        AnchorPane hbox = new AnchorPane(boxxx,viewFoto,b,textVBox,back);
        hbox.setPadding(new Insets(10));
        hbox.setStyle("-fx-background-color: #FFB4B4;");
        hbox.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());

        stage.getScene().setRoot(hbox);
    }
}

