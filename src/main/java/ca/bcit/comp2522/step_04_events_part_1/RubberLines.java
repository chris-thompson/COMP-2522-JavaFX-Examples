package ca.bcit.comp2522.step_04_events_part_1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Demonstrates the handling of mouse press and mouse drag events.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class RubberLines extends Application {

    // The line the user has drawn
    private Line currentLine;

    // The contents of the application scene
    private Group root;

    /**
     * Displays an initially empty scene and waits for the user to
     * draw lines with the mouse.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        root = new Group();

        final int appWidth = 600;
        final int appHeight = 600;
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK);

        // Registers a listener for pressing the mouse button
        scene.setOnMousePressed(this::processMousePress);

        // Registers a listener for dragging the mouse
        scene.setOnMouseDragged(this::processMouseDrag);

        primaryStage.setTitle("RubberLines");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Adds a new line to the scene when the mouse button is pressed.
     *
     * @param event invoked this method
     */
    public void processMousePress(final MouseEvent event) {
        currentLine = new Line(event.getX(), event.getY(), event.getX(), event.getY());
        currentLine.setStroke(Color.CYAN);
        final int strokeWidth = 3;
        currentLine.setStrokeWidth(strokeWidth);

        // This line is important.  We are adding the new line to the Scene.
        root.getChildren().add(currentLine);
    }

    /**
     * Updates the end point of the current line as the mouse is dragged,
     * creating the rubber band effect.
     *
     * @param event invoked this method
     */
    public void processMouseDrag(final MouseEvent event) {
        currentLine.setEndX(event.getX());
        currentLine.setEndY(event.getY());
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

