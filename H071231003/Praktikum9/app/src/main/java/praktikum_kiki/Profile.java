package praktikum_kiki;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Profile {
    private Stage stage;
    private String nama;
    private String nim;

    public Profile(Stage stage) {
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
        Label b = new Label("DATA ANDA\n ");
        b.getStyleClass().add("label-pertama");
    

        Image foto = new Image("image/fotoo.jpeg");
        ImageView viewFoto = new ImageView(foto);
        viewFoto.setFitHeight(200);
        viewFoto.setFitWidth(200);

        VBox gambar = new VBox(viewFoto);
        gambar.setPadding(new Insets(10, 10, 10, 150)); // Add padding around the image
        gambar.setAlignment(Pos.CENTER); // Center the image vertically

        Label lnama = new Label("NAMA\t\t\t : " + nama);
        lnama.getStyleClass().add("label-hasil");

        Label lNim = new Label("NIM\t\t\t\t : " + nim);
        lNim.getStyleClass().add("label-hasil");

        VBox textVBox = new VBox(lnama, lNim);
        textVBox.setSpacing(10);
        textVBox.setAlignment(Pos.TOP_LEFT);

        HBox content = new HBox(textVBox, gambar);
        content.setSpacing(20); // Increase spacing between text and image
        content.setPadding(new Insets(10));
        content.setAlignment(Pos.TOP_LEFT);

        Button back = new Button("Back");
        back.getStyleClass().add("home");
        back.setMaxHeight(30);
        back.setPrefHeight(30);
        back.setOnAction(e -> {
            Home home = new Home(stage);
            home.show();
        });

        HBox be = new HBox(b);
        be.setAlignment(Pos.CENTER);

        HBox buttonBox = new HBox(back);
        buttonBox.setAlignment(Pos.BOTTOM_RIGHT);

        VBox hbox = new VBox(be, content, buttonBox);
        hbox.setSpacing(20);
        hbox.setPadding(new Insets(10));
        hbox.setAlignment(Pos.TOP_LEFT);
        hbox.getStylesheets().add(getClass().getResource("/style/Style.css").toExternalForm());

        stage.getScene().setRoot(hbox);
    }
}