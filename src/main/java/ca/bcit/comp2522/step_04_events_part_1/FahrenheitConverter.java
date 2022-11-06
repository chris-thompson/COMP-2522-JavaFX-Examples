package ca.bcit.comp2522.step_04_events_part_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Demonstrates the use of a TextField and a GridPane.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class FahrenheitConverter extends Application {

    /**
     * Launches the temperature converter application.
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        final int appWidth = 300;
        final int appHeight = 150;
        Scene scene =
                new Scene(new FahrenheitPane(), appWidth, appHeight);

        primaryStage.setTitle("Fahrenheit Converter");
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

