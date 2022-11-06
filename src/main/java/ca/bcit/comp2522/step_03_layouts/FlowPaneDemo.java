package ca.bcit.comp2522.step_03_layouts;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Demonstrates how to use a FlowPane.
 * <a href="https://openjfx.io/javadoc/18/javafx.graphics/javafx/scene/layout/FlowPane.html">FlowPane</a>
 *
 * @author BCIT
 * @version 2022
 */
public class FlowPaneDemo extends Application {

    /**
     * Creates the FlowPane.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        Button b1 = new Button("Push Me!");
        Button b2 = new Button("No, Push ME!");
        Button b3 = new Button("I'm the BEST! Push Me!");
        Button b4 = new Button("Smart people push me!");
        Button b5 = new Button("Don't listen to them.  Push me!");

        FlowPane pane = new FlowPane(b1, b2, b3, b4, b5);
        pane.setStyle("-fx-background-color: dimgrey");

        // Using a static constant from the Pos class
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(5);

        Scene scene = new Scene(pane, 400, 100);

        primaryStage.setTitle("FlowPane Demo");
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
