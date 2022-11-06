package ca.bcit.comp2522.step_03_layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Demonstrates how to use an AnchorPane.
 * <a href="https://openjfx.io/javadoc/18/javafx.graphics/javafx/scene/layout/AnchorPane.html">AnchorPane</a>
 *
 * @author BCIT
 * @version 2022
 */
public class AnchorPaneDemo extends Application {

    /**
     * Creates the AnchorPane.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {

        // Our first controls.  They don't do anything.  Yet...
        Button prev = new Button("Prev");
        Button next = new Button("Next");

        // Here is where we instantiate our AnchorPane object
        // and add the initial list of Nodes
        AnchorPane navPane = new AnchorPane(prev, next);
        navPane.setStyle("-fx-background-color: black");
        navPane.setPrefHeight(70);

        // And this is where we set the anchors
        AnchorPane.setBottomAnchor(prev, 20.0);
        AnchorPane.setLeftAnchor(prev, 30.0);
        AnchorPane.setBottomAnchor(next, 20.0);
        AnchorPane.setRightAnchor(next, 30.0);

        Scene scene = new Scene(navPane, 500, 400);

        primaryStage.setTitle("AnchorPane Demo");
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
