package br.ggg.gerenciadortarefasescolares;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Scene sceneLista = new Scene(fxmlLoader.load(), 800, 400);
        stage.setTitle("Hello!");
        stage.setScene(sceneLista);
        stage.show();
    }
 //https://dontpad.com/javafxcodigoigor
    public static void mudarTela(){


    }

    public static void main(String[] args) {
        launch();
    }
}