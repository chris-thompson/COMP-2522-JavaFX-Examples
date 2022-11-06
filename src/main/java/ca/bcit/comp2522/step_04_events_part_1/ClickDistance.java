package ca.bcit.comp2522.step_04_events_part_1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Demonstrates the handling of a mouse click event.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class ClickDistance extends Application {
    // The line the user draws
    private Line line;

    // Displays the distance
    private Text distanceText;

    /**
     * Shows the distance between the origin (0, 0) and the point where
     * the mouse is clicked.
     * Remember the origin is the upper left corner.
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        line = new Line(0, 0, 0, 0);
        final int textXCoordinate = 150;
        final int textYCoordinate = 30;
        distanceText = new Text(textXCoordinate, textYCoordinate, "Distance:  --");

        Group root = new Group(distanceText, line);

        final int appWidth = 600;
        final int appHeight = 600;
        Scene scene = new Scene(root, appWidth, appHeight, Color.WHITESMOKE);

        // Here's the important part
        scene.setOnMouseClicked(this::processMouseClick);

        primaryStage.setTitle("Click Distance");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Resets the end point of the line to the location of the mouse
     * click event and updates the distance displayed.
     * @param event invoked this method
     */
    public void processMouseClick(final MouseEvent event) {
        double clickX = event.getX();
        double clickY = event.getY();

        line.setEndX(clickX);
        line.setEndY(clickY);

        double distance = Math.sqrt(clickX * clickX + clickY * clickY);

        String distanceStr = String.format("%.2f", distance);
        distanceText.setText("Distance:  " + distanceStr);
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

