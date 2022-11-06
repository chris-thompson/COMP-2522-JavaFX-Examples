package ca.bcit.comp2522.step_02_basic_shapes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Demonstrates the use of loops and conditionals to draw.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class Bullseye extends Application {

    /**
     * Creates and presents the program window. Displays a target using
     * concentric black and white circles and a red center.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        Group root = new Group();
        Color ringColor = Color.BLACK;
        Circle ring = null;
        final int largestRadius = 150;
        final int numberOfRings = 8;
        final int centreCoordinate = 160;
        final int ringWidth = 20;

        int radius = largestRadius;
        for (int count = 1; count <= numberOfRings; count++) {
            ring = new Circle(centreCoordinate, centreCoordinate, radius);
            ring.setFill(ringColor);
            root.getChildren().add(ring);

            if (ringColor.equals(Color.BLACK)) {
                ringColor = Color.WHITE;
            } else {
                ringColor = Color.BLACK;
            }

            radius = radius - ringWidth;
        }

        ring.setFill(Color.RED);

        final int appWidth = 320;
        final int appHeight = 320;
        Scene scene = new Scene(root, appWidth, appHeight, Color.CYAN);

        primaryStage.setTitle("Bullseye");
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

