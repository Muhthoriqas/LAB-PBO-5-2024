package id.yusra.main;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Profile{
    private Stage stage;

    Profile(Stage stage){
        this.stage = stage;
    }
    public void show(){
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 1366, 768);
        Button back = new Button("Kembali");
        // Rectangle template = new Rectangle();
        Image pic = new Image("file:src/main/resources/pic/bgpeace1.png");
        ImageView bg = new ImageView(pic);
        Image pic2 = new Image("file:src/main/resources/pic/profilePic.png");
        ImageView anonim = new ImageView(pic2);
        Rectangle blok = new Rectangle(750, 550);
        HBox hb = new HBox(10);
        VBox data = new VBox(10);
        Label nama = new Label("Nama : Yusra Erlangga Putra");
        Label nim = new Label("NIM : H071231052");
        Label TTL = new Label("Camba Maros, 05-Agustus-2005");

        scene.getStylesheets().add(getClass().getResource("/style/profile.css").toExternalForm());

        back.getStyleClass().add("back-button");
        nama.getStyleClass().add("teks");
        nim.getStyleClass().add("teks");
        TTL.getStyleClass().add("teks");
        // root.getStyleClass().add("background");

        back.setOnAction(e -> {
            LoginPage main = new LoginPage(stage);
            try {
                main.show();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
        bg.setFitWidth(1366);
        bg.setFitHeight(768);
        blok.setOpacity(0.75);
        hb.setAlignment(Pos.CENTER);
        hb.setPadding(new Insets(10));
        hb.setMaxWidth(750);
        hb.setMaxHeight(550);
        data.setAlignment(Pos.CENTER);
        anonim.setFitHeight(250);
        anonim.setFitWidth(250);
        
        data.getChildren().addAll(nama, nim, TTL);
        hb.getChildren().addAll(anonim,data);
        root.getChildren().addAll(bg, blok, hb);
        root.setPadding(new Insets(40));
        double screenWidth = Screen.getPrimary().getVisualBounds().getWidth();
        double screenHeight = Screen.getPrimary().getVisualBounds().getHeight();
        root.setPrefSize(screenWidth, screenHeight);
        root.getChildren().addAll(back);
        StackPane.setAlignment(back, Pos.TOP_RIGHT);
        stage.setScene(scene);
        stage.setTitle("Tuprak ni boss");
        stage.show();
    }
}