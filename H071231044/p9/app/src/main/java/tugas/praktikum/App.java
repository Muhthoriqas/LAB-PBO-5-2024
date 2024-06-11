package tugas.praktikum;

import java.util.HashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
    private Map<String, String> userCredentials = new HashMap<>();
    private Map<String, String> userProfiles = new HashMap<>();
    private String currentLoggedInUser;
    private String username;
    private String password;
    private String name;
    private String date;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(mainMenuScene(stage));
        stage.show();
    }

    private Scene mainMenuScene(Stage stage) {
        Label judul1 = new Label("WELCOME");
        judul1.getStyleClass().add("judul");
        judul1.relocate(220, 120);

        Button btn1 = new Button("Login");
        btn1.getStyleClass().add("button");
        btn1.relocate(240, 210);
        btn1.setOnAction(e -> stage.setScene(loginScene(stage)));

        Button btn2 = new Button("Register");
        btn2.getStyleClass().add("button");
        btn2.relocate(240, 270);
        btn2.setOnAction(e -> stage.setScene(registerScene(stage)));

        Pane root = new Pane();
        root.getChildren().addAll(judul1, btn1, btn2);
        root.getStyleClass().add("latar");
        Scene scene = new Scene(root, 640, 480);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setTitle("App");
        return scene;
    }

    private Scene registerScene(Stage stage) {
        Label registerLabel = new Label("REGISTER");
        registerLabel.getStyleClass().add("judul");
        registerLabel.relocate(215, 70);

        Label nama1 = new Label("Name\t:");
        TextField nama2 = new TextField();
        nama1.getStyleClass().add("input");
        nama1.relocate(90, 140);
        nama2.relocate(190, 140);
        nama2.getStyleClass().add("tabelInput");

        Label dateLabel = new Label("Birthday\t:");
        TextField dateField = new TextField();
        dateLabel.getStyleClass().add("input");
        dateLabel.relocate(90, 180);
        dateField.relocate(190, 180);
        dateField.getStyleClass().add("tabelInput");

        Label usernama1 = new Label("Username:");
        TextField usernama2 = new TextField();
        usernama1.getStyleClass().add("input");
        usernama1.relocate(90, 220);
        usernama2.relocate(190, 220);
        usernama2.getStyleClass().add("tabelInput");

        Label passwordLabel = new Label("Password\t:");
        PasswordField passwordField = new PasswordField();
        passwordLabel.getStyleClass().add("input");
        passwordLabel.relocate(90, 260);
        passwordField.relocate(190, 260);
        passwordField.getStyleClass().add("tabelInput");

        Label salah1 = new Label();
        salah1.getStyleClass().add("error");
        salah1.relocate(190, 300);

        Button submit = new Button("Submit");
        submit.getStyleClass().add("buttonS");
        submit.relocate(440, 320);
        submit.setOnAction(e -> {
            name = nama2.getText();
            date = dateField.getText();
            username = usernama2.getText();
            password = passwordField.getText();
            if (name.isEmpty() || date.isEmpty() || username.isEmpty() || password.isEmpty()) {
                salah1.setText("Please fill in all fields");
                salah1.getStyleClass().add("warning");
                salah1.relocate(410, 290);
            } else if (password.length() < 8) {
                salah1.setText("Password must be at least 8 characters");
                salah1.getStyleClass().add("warning");
                salah1.relocate(190, 290);
            } else {
                userCredentials.put(username, password);
                userProfiles.put(username, name + ", Birthday\t: " + date);
                stage.setScene(registerSuccess(stage));
            }
        });

        Button back = new Button("Back");
        back.getStyleClass().add("buttonS");
        back.relocate(270, 340);
        back.setOnAction(e -> stage.setScene(mainMenuScene(stage)));

        Pane root = new Pane();
        root.getChildren().addAll(registerLabel, nama1, nama2, dateField, dateLabel, usernama1, usernama2, passwordField, passwordLabel, submit, salah1, back
        );
        root.getStyleClass().add("latar");
        Scene scene = new Scene(root, 640, 480);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        return scene;
    }

    private Scene registerSuccess(Stage stage) {
        Label success = new Label("Registration Successful");
        success.getStyleClass().add("judul");
        success.relocate(143, 150);

        Button back = new Button("Back");
        back.getStyleClass().add("buttonS");
        back.relocate(270, 250);
        back.setOnAction(e -> stage.setScene(mainMenuScene(stage)));

        Pane root = new Pane();
        root.getChildren().addAll(success, back);
        root.getStyleClass().add("latar");
        Scene scene = new Scene(root, 640, 480);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        return scene;
    }

    private Scene loginScene(Stage stage) {
        Label loginLabel = new Label("LOGIN");
        loginLabel.getStyleClass().add("judul");
        loginLabel.relocate(250, 100);

        Label usernameLogin1 = new Label("Username:");
        TextField usernameLogin2 = new TextField();
        usernameLogin1.getStyleClass().add("input");
        usernameLogin1.relocate(90, 200);
        usernameLogin2.relocate(190, 200);
        usernameLogin2.getStyleClass().add("tabelInput");

        Label passLogin = new Label("Password\t:");
        PasswordField passwordFieldLogin = new PasswordField();
        passLogin.getStyleClass().add("input");
        passLogin.relocate(90, 240);
        passwordFieldLogin.relocate(190, 240);
        passwordFieldLogin.getStyleClass().add("tabelInput");

        Label salah2 = new Label();
        salah2.getStyleClass().add("error");
        salah2.relocate(190, 300);
        
        Button submit1 = new Button("Submit");
        submit1.getStyleClass().add("buttonS");
        submit1.relocate(440, 300);
        submit1.setOnAction(e -> {
            String username = usernameLogin2.getText();
            String password = passwordFieldLogin.getText();

            if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
                currentLoggedInUser = username;
                stage.setScene(profileScene(stage));
            } else {
                salah2.setText("Invalid username or password");
                salah2.getStyleClass().add("warning");
                salah2.relocate(360, 267);
            }
        });

        Button back = new Button("Back");
        back.getStyleClass().add("buttonS");
        back.relocate(270, 340);
        back.setOnAction(e -> stage.setScene(mainMenuScene(stage)));

        Pane root = new Pane();
        root.getChildren().addAll(loginLabel, passLogin, passwordFieldLogin, usernameLogin1, usernameLogin2, back, submit1, salah2);
        root.getStyleClass().add("latar");
        Scene scene = new Scene(root, 640, 480);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        return scene;
    }

    private Scene profileScene(Stage stage) {
        Label profil = new Label("PROFILE");
        profil.getStyleClass().add("judul");
        profil.relocate(250, 100);

        String[] profileDetails = userProfiles.get(currentLoggedInUser).split(", ");
        Label hasilNama = new Label("Name\t: " + profileDetails[0]);
        hasilNama.getStyleClass().add("input");
        hasilNama.relocate(90, 170);

        Label hasilDate = new Label("" + profileDetails[1]);
        hasilDate.getStyleClass().add("input");
        hasilDate.relocate(90, 210);


        Button back = new Button("Back");
        back.getStyleClass().add("buttonS");
        back.relocate(440, 340);
        back.setOnAction(e -> stage.setScene(mainMenuScene(stage)));

        Pane root = new Pane();
        root.getChildren().addAll(profil, back, hasilNama, hasilDate);
        root.getStyleClass().add("latar");
        Scene scene = new Scene(root, 640, 480);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        return scene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
