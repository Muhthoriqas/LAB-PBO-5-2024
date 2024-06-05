package praktikum_kiki;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Home {
    Stage stage;

    public Home(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        Label label = new Label("MASUKAN DATA");
        label.setTextFill(Color.BLUE);
        label.setFont(Font.font("System", FontWeight.BOLD, 30));

        Label nama = new Label("Masukan Nama");
        nama.getStyleClass().add("label-permintaan");
        nama.setPadding(new Insets(0, 0, 0, 20));
        TextField tNama = new TextField();
        tNama.setMaxWidth(200); // Set max width
        tNama.getStyleClass().add("tabel");
        VBox hnama = new VBox(nama, tNama);
        hnama.setSpacing(10);

        Label Nim = new Label("Masukan NIM");
        Nim.setPadding(new Insets(0, 0, 0, 20));
        Nim.getStyleClass().add("label-permintaan");
        TextField tNim = new TextField();
        tNim.setMaxWidth(200); // Set max width
        tNim.getStyleClass().add("tabel");
        VBox hNim = new VBox(Nim, tNim);
        hNim.setSpacing(10);


        Button buton = new Button("NEXT");
        buton.getStyleClass().add("home");
        buton.setMaxHeight(30);
        buton.setPrefWidth(100);
        buton.setOnAction(e -> {
            if(tNama.getText().trim().isEmpty()) {
                return;
            } else {
                Profile pro = new Profile(stage);
                pro.setNama(tNama.getText());
                pro.setNim(tNim.getText());
                pro.show();
            }
        });

        HBox box = new HBox(buton);
        // box.setAlignment(Pos.BOTTOM_RIGHT);
        box.setPadding(new Insets(180,0, 0, 500));

        VBox gabung = new VBox(label, hnama, hNim, box);
        gabung.setAlignment(Pos.TOP_CENTER);
        gabung.setSpacing(25);
        gabung.setPadding(new Insets(10));
        gabung.getStylesheets().add(getClass().getResource("/style/Style.css").toExternalForm());
        stage.getScene().setRoot(gabung);

    }
}

