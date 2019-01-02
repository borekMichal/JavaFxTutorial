package aaaa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;




public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
            }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("Kliknij mnie");
        StackPane root = new StackPane();
        //root.getChildren().add(btn);
        Scene scena = new Scene(root, 500,300);

        primaryStage.setTitle("Zarzadzanie użytkownikami");

        primaryStage.setScene(scena);
        primaryStage.show();

        Przycisk p = new Przycisk();
        Przycisk b = new Przycisk();
        PrzyciskSwing pp = new PrzyciskSwing();

        root.getChildren().add(p);
        root.getChildren().add(b);

        //scena.

        //btn.setOnAction(e->btn.setText("Działa"));

    }

    public void initialization (){


    }
}
