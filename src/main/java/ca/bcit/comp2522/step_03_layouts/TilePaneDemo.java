package ca.bcit.comp2522.step_03_layouts;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

/**
 * Demonstrates how to use a TilePane.
 *
 * @author BCIT
 * @version 2022
 */
public class TilePaneDemo extends Application {

    /**
     * Creates the TilePane.
     *
     * @param primaryStage
     *            a Stage
     */
    public void start(final Stage primaryStage) {
        Button b1 = new Button("Push Me!");
        Button b2 = new Button("No, Push ME!");
        Button b3 = new Button("I'm the BEST! Push Me!");
        Button b4 = new Button("Smart people push me!");
        Button b5 = new Button("Don't listen to them.  Push me!");

        TilePane pane = new TilePane(b1, b2, b3, b4, b5);
        pane.setStyle("-fx-background-color: dimgrey");
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(5);

        Scene scene = new Scene(pane, 300, 200);

        primaryStage.setTitle("TilePane Demo");
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
