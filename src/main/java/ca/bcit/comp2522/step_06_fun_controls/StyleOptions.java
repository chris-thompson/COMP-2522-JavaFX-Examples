package ca.bcit.comp2522.step_06_fun_controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Demonstrates the use of check boxes.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class StyleOptions extends Application {

    /**
     * Creates and presents the program window.
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        StyleOptionsPane pane = new StyleOptionsPane();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: skyblue");

        final int appWidth = 400;
        final int appHeight = 150;
        Scene scene = new Scene(pane, appWidth, appHeight);

        primaryStage.setTitle("Style Options");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Launches the JavaFX application.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        launch(args);
    }
}

