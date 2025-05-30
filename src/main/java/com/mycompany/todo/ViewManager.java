package com.mycompany.todo;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ViewManager {
    private static Stage primaryStage;

    public static void setStage(Stage stage) {
        primaryStage = stage;
    }

    public static void switchTo(String fxmlPath, int width, int height) {
        try {
URL fxmlUrl = ViewManager.class.getResource(fxmlPath);
if (fxmlUrl == null) {
    throw new IllegalArgumentException("FXML not found at: " + fxmlPath);
}
System.out.println("Loading FXML from: " + fxmlUrl.toExternalForm());
FXMLLoader loader = new FXMLLoader(ViewManager.class.getResource(fxmlPath));
            Parent root = loader.load();
            primaryStage.setScene(new Scene(root, width, height));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
